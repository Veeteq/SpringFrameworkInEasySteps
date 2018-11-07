package com.springframework.jdbc.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcTest {

	static ApplicationContext context = new ClassPathXmlApplicationContext("jdbcTemplConfig.xml");
	
	public static void main(String[] args) {

		JdbcTemplate jdbcTemplate =  (JdbcTemplate) context.getBean("jdbcTemplate");
		String sql = "insert into spring.employee values(?,?,?)";
		int result = jdbcTemplate.update(sql, 1, "Witek","Wojnarowicz");
		System.out.println("result: " + result);
	}

}
