package com.springframework.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springframework.HotelCustomer;

public class HotelTest {
	static ApplicationContext context = new ClassPathXmlApplicationContext("hotelConfig.xml");
	
	public static void main(String[] args) {
		HotelCustomer hotelCustomer = (HotelCustomer) context.getBean("hotelCustomer");
		System.out.println(hotelCustomer);
	}
}
