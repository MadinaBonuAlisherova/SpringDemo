package com.madinabonu.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {
    public static void main(String[] args) {
        //load the spring configure
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");

        Classes theClass = (Classes) context.getBean("myClass");

        System.out.println(theClass.printSyllabus());


        //close context
        context.close();
    }
}
