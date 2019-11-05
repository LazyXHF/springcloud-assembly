package cn.xu.eurake;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Eurake02Application {

    public static void main(String[] args) {
        SpringApplication.run(Eurake02Application.class, args);
    }

}
