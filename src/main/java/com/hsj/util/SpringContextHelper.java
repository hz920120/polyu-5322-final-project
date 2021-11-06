package com.hsj.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @Description:获取Spring上下文
 * @author HeShengjin 2356899074@qq.com
 * @date 2021/8/18 17:24
 */
@Component("springContextHelper")
public class SpringContextHelper implements ApplicationContextAware{

    private static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext context) throws BeansException {
        applicationContext = context;
    }

    public static <T> T popBean(Class<T> clazz){
        if(applicationContext == null){
            return null;
        }
        return applicationContext.getBean(clazz);
    }

    public static <T> T popBean(String name,Class<T> clazz){
        if(applicationContext == null){
            return null;
        }
        return applicationContext.getBean(name,clazz);
    }
}
