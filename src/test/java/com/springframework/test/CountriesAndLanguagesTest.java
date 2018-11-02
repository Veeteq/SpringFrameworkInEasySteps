package com.springframework.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springframework.CountriesAndLanguages;

public class CountriesAndLanguagesTest {

	static ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
	
	public static void main(String[] args) {
		CountriesAndLanguages countriesAndLanguages = (CountriesAndLanguages) context.getBean("countriesAndLanguages");
		System.out.println(countriesAndLanguages);
	}
}
