package com.madinabonu.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String[] args) {
        //load the spring configure
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        //retrieve bean from the spring container
        Classes theClass = context.getBean("myClass", Classes.class);

        Classes otherClass = context.getBean("myClass", Classes.class);

        //check if the the are the same
        boolean result = (theClass == otherClass);

        //display results
        System.out.println("\nPointing to the same area address of memory: "+result);

        //display memory location
        System.out.println("\nMemory location for theClass: "+theClass);
        System.out.println("\nMemory location for otherClass : "+otherClass+"\n");

        context.close();
    }
}
