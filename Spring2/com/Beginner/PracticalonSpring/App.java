package com.Beginner.PracticalonSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("NewFile1.xml");
      
       Vehicle obj =(Vehicle)context.getBean("car");
        
       obj.drive();
      
        Tyre t = (Tyre)context.getBean("Tyre");
        System.out.println(t);
        
        
    }
}
