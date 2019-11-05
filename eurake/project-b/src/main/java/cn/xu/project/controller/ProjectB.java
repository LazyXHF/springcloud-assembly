package cn.xu.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author ~许小桀
 * @date 2019/11/5 23:11
 */
@RestController
public class ProjectB {

    @Value("${server.port}")
    private String port;

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("index")
    public String getString(){
        return restTemplate.getForEntity("http://app-xxj-member/index",String.class)+"服务端口为:"+port;
    }
}
