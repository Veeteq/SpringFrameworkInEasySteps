package com.springframework.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springframework.Employee;

public class EmployeeTest {

	static ApplicationContext context = new ClassPathXmlApplicationContext("springconfig2.xml");
	
	public static void main(String[] args) {
		Employee employee = (Employee) context.getBean("employee");
		System.out.println(employee);
	}
}
