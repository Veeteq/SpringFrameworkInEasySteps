package com.springframework.test.ls;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springframework.lc.Prescription;

public class PrescriptionTest {

	static AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springframework/lc/springconfig2.xml");

	public static void main(String[] args) {
		Prescription prescription = (Prescription) context.getBean("prescription");
		System.out.println(prescription);
		context.registerShutdownHook();
	}
}
