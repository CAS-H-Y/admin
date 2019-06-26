package com.heyang.utill;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @ProjectName: mall-heyang
 * @Package: com.heyang.utill
 * @Description: java类作用描述
 * @Author: heyang
 * @CreateDate: 2019/6/26 9:10
 */
public class SpringUtil implements ApplicationContextAware {

    private static ApplicationContext applicationContext = null;

    @Override
    public void setApplicationContext(ApplicationContext arg0) throws BeansException {
        if (applicationContext == null) {

            applicationContext = arg0;

        }
    }

    public static ApplicationContext getApplicationContext() {

        return applicationContext;

    }

    public static void setAppCtx(ApplicationContext webAppCtx) {

        if (webAppCtx != null) {

            applicationContext = webAppCtx;

        }
    }
        /**
         * 拿到ApplicationContext对象实例后就可以手动获取Bean的注入实例对象

         */

        public static <T> T getBean(Class < T > clazz) {

            return getApplicationContext().getBean(clazz);

        }
    public static <T> T getBean(String name, Class<T> clazz) throws ClassNotFoundException {

        return getApplicationContext().getBean(name, clazz);

    }



    public static final Object getBean(String beanName) {

        return getApplicationContext().getBean(beanName);

    }

    public static final Object getBean(String beanName, String className) throws ClassNotFoundException {

        Class clz = Class.forName(className);

        return getApplicationContext().getBean(beanName, clz.getClass());

    }



    public static boolean containsBean(String name) {

        return getApplicationContext().containsBean(name);

    }
}
