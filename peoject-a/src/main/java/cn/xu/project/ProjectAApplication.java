package cn.xu.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ProjectAApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectAApplication.class, args);
    }

}
