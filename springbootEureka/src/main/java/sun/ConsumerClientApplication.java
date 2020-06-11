package sun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @program: 即停科技
 * @description
 * @author: jianghong
 * @create: 2020-06-11 13:34
 **/

@SpringBootApplication
@EnableEurekaServer
public class ConsumerClientApplication {

    public static void main(String[] args) {

        SpringApplication.run(ConsumerClientApplication.class, args);
    }
}
