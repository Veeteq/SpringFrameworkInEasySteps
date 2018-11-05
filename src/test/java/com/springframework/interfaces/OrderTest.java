package com.springframework.interfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OrderTest {

	static ApplicationContext context = new ClassPathXmlApplicationContext("com/springframework/interfaces/springconfig.xml");
	
	public static void main(String[] args) {
		OrderBO orderBO = (OrderBO) context.getBean("orderBO");
		orderBO.placeOrder();
	}
}
