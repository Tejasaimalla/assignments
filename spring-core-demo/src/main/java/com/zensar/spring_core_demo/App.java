package com.zensar.spring_core_demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.zensar.beans.Student;
import com.zensar.config.JavaConfiguration;

public class App {
	public static void main(String[] args) {

		//ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

		//Student student1 = context.getBean("stud", Student.class);
		

		//System.out.println(student1);
		
		//((AbstractApplicationContext) context).close();
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfiguration.class);
		
	
		Student student1 = context.getBean("stud", Student.class);
		
		Student student2 = context.getBean("stud", Student.class);
		System.out.println(student1.hashCode());
		System.out.println(student2.hashCode());
		
		System.out.println(student2);
		
		System.out.println(student1);
		
	}
}
