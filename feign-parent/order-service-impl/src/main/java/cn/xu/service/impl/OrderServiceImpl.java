package cn.xu.service.impl;


import cn.xu.entity.User;
import cn.xu.feign.NumberFeign;
import cn.xu.service.OrderService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ~许小桀
 * @date 2019/11/7 0:17
 */
@RestController
public class OrderServiceImpl implements OrderService {

    @Autowired
    private NumberFeign numberFeign;
    @RequestMapping("/order")
    public User orderToMember( String name) {
        User user = numberFeign.getUser(name);
        System.out.println("线程池"+Thread.currentThread().getName());
        return user;
    }

    // 解决服务雪崩效应
    // fallbackMethod 方法的作用：服务降级执行
    // @HystrixCommand 默认开启线程池隔离方式,服务降级,服务熔断
    // 设置Hystrix服务超时时间
    /**
     * @HystrixCommand<br>
     * 					默认开启服务隔离方式 以线程池方式<br>
     *                     默认开启服务降级执行方法orderToMemberUserInfoHystrixFallback<br>
     *                     默认开启服务熔断机制<br>
     *
     * @return
     */
    @RequestMapping("/orderByHystrix")
    @HystrixCommand(fallbackMethod = "orderToMemberByHystrix")
    public User orderToMemberByHystrix(String name){
        User user = numberFeign.getUser(name);
        System.out.println("线程池"+Thread.currentThread().getName());
        return user;
    }

    public String orderToMemberByHystrix(){
        return "服务保护";
    }
}
