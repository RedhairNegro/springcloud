package sun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @program: 即停科技
 * @description
 * @author: jianghong
 * @create: 2020-06-11 11:33
 **/

@SpringBootApplication
@ServletComponentScan
@EnableDiscoveryClient
@RefreshScope   // 开启配置更新功能
@EnableFeignClients
public class ComsumerClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ComsumerClientApplication.class, args);
    }
}
