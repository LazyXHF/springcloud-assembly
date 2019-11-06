package cn.xu.order.service.impl;


import cn.xu.order.entity.User;
import cn.xu.order.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ~许小桀
 * @date 2019/11/6 23:54
 */
@RestController
public class UserServiceImpl implements UserService {


    @RequestMapping("/getUser")
    public User getUser(@RequestParam String name) {

        return new User(name,"123");
    }
}
