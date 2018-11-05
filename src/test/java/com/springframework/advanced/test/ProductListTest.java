package com.springframework.advanced.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springframework.advanced.ProductList;

public class ProductListTest {

	static ApplicationContext context = new ClassPathXmlApplicationContext("com/springframework/advanced/springconfig.xml");
	
	public static void main(String[] args) {
		ProductList productList = (ProductList) context.getBean("productList");
		System.out.println(productList);
	}
}
