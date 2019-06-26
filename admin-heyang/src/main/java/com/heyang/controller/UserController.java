package com.heyang.controller;

import com.heyang.annotion.RecodeLog;
import com.heyang.test.MallLogin;
import com.heyang.utill.SpringUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: mall-heyang
 * @Package: com.heyang.controller
 * @Description: java类作用描述
 * @Author: heyang
 * @CreateDate: 2019/6/24 17:20
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @RecodeLog(type = "1")
    @GetMapping("/test")
    public void test(){
        MallLogin mallLoginAspect= (MallLogin) SpringUtil.getBean("MallLoginAspect");
        System.out.print(SpringUtil.containsBean("MallLoginAspect")+"----");
        System.out.println("test...");
    }
}
