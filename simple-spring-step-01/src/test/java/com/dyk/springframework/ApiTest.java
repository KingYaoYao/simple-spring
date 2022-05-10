package com.dyk.springframework;

import com.dyk.springframework.bean.UserService;
import org.junit.Test;

/**
 * @author DYK
 * @description: TODO
 * @date 2022/5/1017:17
 */

public class ApiTest {
    @Test
    public void test_BeanFactory(){
        //1.初始化Bean工厂
        BeanFactory beanFactory = new BeanFactory();

        //2.注册bean
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("UserService",beanDefinition);

        //3.获取bean
        UserService userService = (UserService)beanFactory.getBean("UserService");
        userService.queryUserInfo();

    }
}
