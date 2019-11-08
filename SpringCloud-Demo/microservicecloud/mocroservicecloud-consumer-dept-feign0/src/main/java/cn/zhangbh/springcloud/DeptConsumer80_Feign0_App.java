package cn.zhangbh.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"cn.zhangbh.springcloud"})
@ComponentScan("cn.zhangbh.springcloud")
public class DeptConsumer80_Feign0_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80_Feign0_App.class, args);
    }
}
