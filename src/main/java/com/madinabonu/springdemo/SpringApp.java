package com.madinabonu.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {
    public static void main(String[] args) {
        //load the spring configuration file
        ClassPathXmlApplicationContext context  =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve bean from spring container              //interface
        Classes theClass = context.getBean("myClass", Classes.class);

        //call methods on the bean
        System.out.println(theClass.printSyllabus());

        //call method for lecture
        System.out.println(theClass.DisplayWeekLecture());

        //close the context
        context.close();

    }
}
