package com.dyk.springframework;


import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author DYK
 * @description: Bean对象工程，存放Bean定义到Map中，以及获取
 * @date 2022/5/1015:00
 */
public class BeanFactory {

    private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

    public Object getBean(String name) {
        return beanDefinitionMap.get(name).getBean();
    }

    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(name, beanDefinition);
    }

}
