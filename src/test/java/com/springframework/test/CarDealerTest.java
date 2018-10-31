package com.springframework.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springframework.CarDealer;

public class CarDealerTest {

	static ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
	
	public static void main(String[] args) {
		CarDealer carDealer = (CarDealer) context.getBean("carDealer");
		System.out.println(carDealer.getName());
		System.out.println(carDealer.getModels());
	}
}
