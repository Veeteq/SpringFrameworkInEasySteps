package com.springframework.advanced.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springframework.advanced.Instructor;

public class InstructorTest {

	static ApplicationContext context = new ClassPathXmlApplicationContext("com/springframework/advanced/instructorConfig.xml");
	
	public static void main(String[] args) {
		Instructor instructor1 = (Instructor) context.getBean("inst");
		System.out.println(instructor1.hashCode() + ", " + instructor1);
		
		Instructor instructor2 = (Instructor) context.getBean("inst");
		System.out.println(instructor2.hashCode() + ", " + instructor2);
	}
}
