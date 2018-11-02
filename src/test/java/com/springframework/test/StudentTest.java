package com.springframework.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springframework.Student;

public class StudentTest {
	static ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
	
	public static void main(String[] args) {
		Student student1 = (Student) context.getBean("student1");
		System.out.println(student1);
		
		Student student2 = (Student) context.getBean("student2");
		System.out.println(student2);
		
		Student student3 = (Student) context.getBean("student3");
		System.out.println(student3);
	}
}
