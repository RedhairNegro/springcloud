package sun.controller;

import common.entity.RestfulResult;
import common.utils.CommonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.client.ServiceFeignClient;
import sun.entity.ServiceInfo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @program: 即停科技
 * @description
 * @author: jianghong
 * @create: 2020-06-11 11:40
 **/

@RestController
public class ServiceController {

    @Autowired
    ServiceFeignClient serviceFeignClient;

    // 调用：localhost:6004/consumerService?token=1
    @RequestMapping("/consumerService")
    public void consumerService(HttpServletRequest request, HttpServletResponse response,
                                @RequestBody ServiceInfo serviceInfo){

        RestfulResult restfulResult =  serviceFeignClient.hello(serviceInfo);

        CommonUtils.printDataJason(response, restfulResult);
    }
}