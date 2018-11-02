package com.springframework.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springframework.University;

public class UniversityTest {

	static ApplicationContext context = new ClassPathXmlApplicationContext("springconfig2.xml");
	
	public static void main(String[] args) {
		University university1 = (University) context.getBean("university");
		System.out.println(university1);
		
		University university2 = (University) context.getBean("university");
		System.out.println(university2);
	}
}
