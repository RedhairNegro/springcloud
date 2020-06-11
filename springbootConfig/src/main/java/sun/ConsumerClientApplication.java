package sun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @program: 即停科技
 * @description
 * @author: jianghong
 * @create: 2020-06-11 15:04
 **/

@SpringBootApplication
@EnableConfigServer
public class ConsumerClientApplication {

    public static void main(String[] args) {

        SpringApplication.run(ConsumerClientApplication.class, args);
    }
}
