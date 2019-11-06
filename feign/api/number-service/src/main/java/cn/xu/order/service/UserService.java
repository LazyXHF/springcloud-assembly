package cn.xu.order.service;

import cn.xu.order.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author ~许小桀
 * @date 2019/11/6 23:52
 */
public interface UserService {
    // 实体类是存放接口项目还是 存放在实现项目 实体类存放在接口项目里面
    // 实体类和定义接口信息存放在接口项目
    // 代码实现存放在接口实现类里面

    @RequestMapping("/getUser")
    User getUser(@RequestParam String name);
}
