package cn.xu.feign.impl;

import cn.xu.entity.User;
import cn.xu.feign.NumberFeign;
import org.springframework.stereotype.Component;

/**
 * @author ~许小桀
 * @date 2019/11/7 20:23
 * Hystrix 类的形式实现 服务治理
 */
@Component
public class NumberFeignImpl implements NumberFeign {

    @Override
    public User getUser(String name) {
        return null;
    }
}
