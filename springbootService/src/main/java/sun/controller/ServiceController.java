package sun.controller;

import common.entity.RestfulResult;
import common.utils.CommonUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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
@RequestMapping(value = "service")
public class ServiceController {

    @RequestMapping(value = "hello")
    public void login(HttpServletRequest request, HttpServletResponse response,
                      @RequestBody ServiceInfo serviceInfo) {

        RestfulResult restfulResult = new RestfulResult();

        try {
            restfulResult.setData("Service1:Welcome " + serviceInfo.getName() + "!");

        } catch (Exception e) {
            e.printStackTrace();
        }

        CommonUtils.printDataJason(response, restfulResult);
    }

    @RequestMapping(value = "rest")
    public String rest(@RequestBody ServiceInfo serviceInfo) {

        return "Service1:Welcome " + serviceInfo.getName() + " !";
    }
}