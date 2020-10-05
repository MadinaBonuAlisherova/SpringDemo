package com.madinabonu.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterInjectionDemo {
    public static void main(String[] args) {
        //load spring configuration
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve bean from spring container
        EnglishClass theClass = (EnglishClass) context.getBean("english");

        //call methods on the bean
        System.out.println(theClass.printSyllabus());
        System.out.println(theClass.DisplayWeekLecture());

        System.out.println("Teacher for this class is "+theClass.gettName());
        System.out.println("Email address of teacher "+theClass.getEmail());
        System.out.println("Phone number of teacher "+theClass.getPhone());
        //close context
        context.close();
    }
}
