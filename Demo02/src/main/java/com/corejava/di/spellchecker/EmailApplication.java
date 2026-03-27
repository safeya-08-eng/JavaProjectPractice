package com.corejava.di.spellchecker;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmailApplication {
    public static void main(String[] args) {
//        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
//        EmailClient emailClient= context.getBean("emailClient",EmailClient.class);
//        emailClient.sendEmail("Hey, "+"This is my first email message");
//        emailClient.sendEmail("Hey, "+"This is my second email message");
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        EmailClient emailClient = context.getBean("EmailClient", EmailClient.class);
        emailClient.sendEmail("Hello Guys");
    }
}