package com.springframework.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springframework.Employee;

public class EmployeeTest2 {

	static ApplicationContext context = new ClassPathXmlApplicationContext("springconfig3.xml");
	
	public static void main(String[] args) {
		Employee employee1 = (Employee) context.getBean("employee1");
		System.out.println(employee1);
		
		Employee employee2 = (Employee) context.getBean("employee2");
		System.out.println(employee2);
		
		Employee employee3 = (Employee) context.getBean("employee3");
		System.out.println(employee3);
	}
}
