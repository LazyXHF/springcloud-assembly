package cn.xu.order.service.impl;

import cn.xu.order.entity.User;
import cn.xu.order.feign.NumberFeign;
import cn.xu.order.service.OrderService;
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
    public String orderToMember(@RequestParam String name) {
        User user = numberFeign.getUser(name);
        return user.toString();
    }

}
