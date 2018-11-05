package com.springframework.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springframework.Employee;

public class EmployeeTestAW {

	static ApplicationContext context = new ClassPathXmlApplicationContext("springCfgAw.xml");
	
	public static void main(String[] args) {
		Employee employee1 = (Employee) context.getBean("employee1");
		System.out.println(employee1);
		
		Employee employee2 = (Employee) context.getBean("employee2");
		System.out.println(employee2);
		
		Employee employee3 = (Employee) context.getBean("employee3");
		System.out.println(employee3);
		
		Employee employee4 = (Employee) context.getBean("employee4");
		System.out.println(employee4);
	}
}
