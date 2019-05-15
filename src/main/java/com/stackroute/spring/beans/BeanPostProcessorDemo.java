package com.stackroute.spring.beans;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostProcessorDemo implements BeanPostProcessor {

    public Object postProcessBeforeInitialization(Object bean,String beanName)
    {
        System.out.println("Before initialization, Bean Name="+beanName);
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean,String beanName)
    {
        System.out.println("After initialisation, Bean Name="+beanName);
        return bean;
    }
}