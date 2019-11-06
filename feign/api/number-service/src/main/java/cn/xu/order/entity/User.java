package cn.xu.order.entity;

import lombok.Data;

/**
 * @author ~许小桀
 * @date 2019/11/6 23:51
 */
@Data
public class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }


}
