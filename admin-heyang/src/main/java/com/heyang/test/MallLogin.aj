package com.heyang.test;

import org.aspectj.lang.JoinPoint;
import org.springframework.stereotype.Component;

/**
 *
 * @ProjectName: mall-heyang
 * @Package: com.heyang.test
 * @Description: java类作用描述
 * @Author: heyang
 * @CreateDate: 2019/6/26 9:34
 */
//@Aspect
//@Component
public class MallLogin {
    //@Pointcut(value = "@annotation(com.heyang.annotion.RecodeLog)")
    public void log(){

    }
    //@Before("log()")
    public void doBefor(JoinPoint joinPoint){
        System.out.print("------log()");
    }
}
