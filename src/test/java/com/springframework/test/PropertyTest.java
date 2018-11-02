package com.springframework.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springframework.PropertiesDAO;

public class PropertyTest {

	static ApplicationContext context = new ClassPathXmlApplicationContext("springconfig3.xml");
	
	public static void main(String[] args) {
		PropertiesDAO propertiesDAO = (PropertiesDAO) context.getBean("propertiesDAO");
		System.out.println(propertiesDAO);
	}
}
