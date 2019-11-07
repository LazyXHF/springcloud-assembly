package cn.xu.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



/**
 * @author ~许小桀
 * @date 2019/11/7 15:53
 */
@RestController
@RefreshScope
public class ConfigController {


    @Value("${name}")
    public String  configInfo;

    @RequestMapping("info")
    public String getConfig(){
        return configInfo+"1111111111111111111";

    }

}
