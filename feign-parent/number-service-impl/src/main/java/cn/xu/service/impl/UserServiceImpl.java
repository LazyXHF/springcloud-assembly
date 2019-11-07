package cn.xu.service.impl;



import cn.xu.entity.User;
import cn.xu.service.UserService;
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
    public User getUser(@RequestParam("name") String name) {
       User user  =  new User();
       user.setUsername(name);
       user.setPassword("123");
        return user;
    }


}
