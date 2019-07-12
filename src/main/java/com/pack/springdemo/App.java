package com.pack.springdemo;

import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Resource res=new ClassPathResource("beans.xml");
        BeanFactory fac=new XmlBeanFactory(res);
        Scanner sc=new Scanner(System.in);
        System.out.println("1.Man");
        System.out.println("2.Woman");
        System.out.println("enter ur choice:");
        String op=sc.next();
        
        
        Human obj=(Human) fac.getBean(op);
      // obj.setName("kiran");
      // obj.setAge(21);
        
        
       System.out.println(obj);
    }
}
