package study;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


/**
 * Created by banma-317 on 2017/11/14.
 */
@SpringBootApplication
@MapperScan("study.mapper")
@EnableEurekaClient
public class UserManageApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserManageApplication.class, args);
    }
}
