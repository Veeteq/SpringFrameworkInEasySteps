package com.springframework.test.ls;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springframework.lc.Patient1;
import com.springframework.lc.Patient2;
import com.springframework.lc.Patient3;

public class PatientTest {
	static AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springframework/lc/springconfig.xml");
	
	public static void main(String[] args) {
		Patient1 patient1 = (Patient1) context.getBean("patient1");
		System.out.println(patient1.getId());		
		
		Patient2 patient2 = (Patient2) context.getBean("patient2");
		System.out.println(patient2.getId());
		
		Patient3 patient3 = (Patient3) context.getBean("patient3");
		System.out.println(patient3.getId());
		
		context.registerShutdownHook();
	}
}