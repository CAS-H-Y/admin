package com.heyang.annotion;

import java.lang.annotation.*;

/**
 * @ProjectName: mall-heyang
 * @Package: com.heyang.annotion
 * @Description: java类作用描述
 * @Author: heyang
 * @CreateDate: 2019/6/24 15:58
 */
@Target({ElementType.METHOD})
@Documented
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface RecodeLog {
    public String type();
    public String description() default "123";
}
