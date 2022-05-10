package com.dyk.springframework;

/**
 * @author DYK
 * @description: 用于定义 Bean 实例化信息
 * @date 2022/5/1014:58
 */
public class BeanDefinition {
    private Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }
}
