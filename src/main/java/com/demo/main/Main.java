package com.demo.main;

import com.demo.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args){
        //String configLoc="classpath*:com/demo/resources/applicationContext.xml";
        String configLoc="applicationContext.xml";
        ApplicationContext context=new ClassPathXmlApplicationContext(configLoc);
        Student std=(Student) context.getBean("stud1", Student.class);
        std.display();
    }
}
