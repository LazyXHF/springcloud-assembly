package cn.xu.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class ProjectBApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectBApplication.class, args);
    }


    @Bean
    @LoadBalanced //使调用的客户端具有负载均衡的能力
    public RestTemplate getTemplate(){
        return new RestTemplate();
    }
}
