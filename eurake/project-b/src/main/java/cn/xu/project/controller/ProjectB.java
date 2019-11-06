package cn.xu.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author ~许小桀
 * @date 2019/11/5 23:11
 */
@RestController
public class ProjectB {
    @Autowired
    private DiscoveryClient discoveryClient;

    @Value("${server.port}")
    private String port;
    @Autowired
    RestTemplate restTemplate;

    //请求数
    private int i = 1;

    @RequestMapping("index")
    public String getString(){
        return restTemplate.getForEntity("http://app-xxj-member/index",String.class)+"服务端口为:"+port;
    }


    @RequestMapping("ribbon")
    public ResponseEntity<String> getRibbon(){
       String path  =  getInstance()+"/index";
       return restTemplate.getForEntity(path,String.class);
    }

    //纯手写Ribbon 实现本地负载均衡
    public String getInstance(){
        List<ServiceInstance> instances = discoveryClient.getInstances("app-xxj-member");
        if (CollectionUtils.isEmpty(instances)) {
            return null;
        }
        //集群个数
        int size = instances.size();
        //当前访问服务器下标
        int j = i % size;
        i++;
        return instances.get(j).getUri().toString();
    }
}
