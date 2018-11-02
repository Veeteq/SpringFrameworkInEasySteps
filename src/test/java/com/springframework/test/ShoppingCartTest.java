package com.springframework.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springframework.ShoppingCart;

public class ShoppingCartTest {
	static ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
	
	public static void main(String[] args) {
		ShoppingCart shoppingCart = (ShoppingCart) context.getBean("shoppingCart");
		System.out.println(shoppingCart);
	}
}
