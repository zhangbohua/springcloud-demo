package cn.zhangbh.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Auther: zhangbh
 * @Date: 2019/11/8 17:29
 * @Description:
 */
@SpringBootApplication
@EnableConfigServer
public class Config_3344_StarSpringCloudApp {
    public static void main(String[] args) {
        SpringApplication.run(Config_3344_StarSpringCloudApp.class, args);
    }
}
