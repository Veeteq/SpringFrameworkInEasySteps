package com.springframework.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springframework.Hospital;

public class HospitalTest {

	static ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
	
	public static void main(String[] args) {
		Hospital hostpital = (Hospital) context.getBean("hospital");
		System.out.println(hostpital.getName());
		System.out.println(hostpital.getDepartments());
	}
}
