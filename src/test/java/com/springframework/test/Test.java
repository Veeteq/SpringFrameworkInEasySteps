package com.springframework.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.springframework.Employee;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
		Employee employee01 = (Employee) context.getBean("employee01");
		System.out.println("Employee: ID = " + employee01.getId() + ", Name = " + employee01.getName() + ", hash = " + employee01.hashCode());
		
		Employee employee02 = (Employee) context.getBean("employee02");
		System.out.println("Employee: ID = " + employee02.getId() + ", Name = " + employee02.getName() + ", hash = " + employee02.hashCode());
		
		Employee employee03 = (Employee) context.getBean("employee01");
		System.out.println("Employee: ID = " + employee03.getId() + ", Name = " + employee03.getName() + ", hash = " + employee03.hashCode());
	}
}
