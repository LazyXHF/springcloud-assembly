package cn.xu.zuul.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ~许小桀
 * @date 2019/11/7 21:09
 */
@RestController
public class ZuulController {

    @Value("${name:test}")
    private String name;

    @RequestMapping("index")
    public String getName(){
        return name+"-----";
    }
}
