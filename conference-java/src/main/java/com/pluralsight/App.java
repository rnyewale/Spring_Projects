package com.pluralsight;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pluralsight.service.SpeackerService;
import com.pluralsight.service.SpeackerService1;
import com.pluralsight.service.SpeakerServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	SpeackerService1 service = context.getBean("speackerServiceBean", SpeackerService1.class);
       // SpeackerService1 service = new SpeakerServiceImpl();
       System.out.println(service.findAll().get(0).getSpeackerName());
    }
}
