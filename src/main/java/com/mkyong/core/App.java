package com.mkyong.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext(
                "src/main/resources/SpringBeans.xml");

        HelloWorld obj = (HelloWorld) context.getBean("helloBean");
        obj.printHello();
    }
}
