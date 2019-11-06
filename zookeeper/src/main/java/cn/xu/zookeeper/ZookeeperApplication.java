package cn.xu.zookeeper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient //作用是 如果服务使用 consul 、 zookeeper 使用
public class ZookeeperApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZookeeperApplication.class, args);
    }

}
