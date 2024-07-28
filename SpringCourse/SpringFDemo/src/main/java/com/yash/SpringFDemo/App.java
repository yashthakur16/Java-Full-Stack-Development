package com.yash.SpringFDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Alien obj = context.getBean(Alien.class);

        
        System.out.println(obj.getAge()); 
        obj.code();
        
//        
//        Alien obj2 = context.getBean(Alien.class);
//
//        
//        obj2.code();
    }
}
