package org.jitu.java.spring.test.test;

import org.jitu.java.spring.test.bean.FirstSpringTestBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FirstSpringTestDemo {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
        FirstSpringTestBean firstSpringTestBean=(FirstSpringTestBean) context.getBean("firstSpringTestBean");
        firstSpringTestBean.test();
    }
}
