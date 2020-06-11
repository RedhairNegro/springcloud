package sun.client;

import common.entity.RestfulResult;
import org.springframework.stereotype.Component;
import sun.entity.ServiceInfo;

/**
 * @program: 即停科技
 * @description
 * @author: jianghong
 * @create: 2020-06-11 16:24
 **/
@Component
public class ServiceFallback implements ServiceFeignClient{

    @Override
    public RestfulResult hello(ServiceInfo serviceInfo) {
        RestfulResult result = new RestfulResult();
        result.setData("服务调用失败!");
        return result;
    }
}
