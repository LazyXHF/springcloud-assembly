package cn.xu.project.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ~许小桀
 * @date 2019/11/5 23:10
 */
@RestController
public class ProjectAController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/index")
    public String getString(){
        return "此项目接口为"+port;
    }
}
