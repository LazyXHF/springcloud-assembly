package cn.xu.order.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author ~许小桀
 * @date 2019/11/7 0:06
 */

public interface OrderService {

    // 订单服务调用会员服务接口信息 feign
    @RequestMapping("/order")
    String orderToMember( String name);
}
