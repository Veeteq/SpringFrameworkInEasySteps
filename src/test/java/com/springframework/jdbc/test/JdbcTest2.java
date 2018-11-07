package com.springframework.jdbc.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springframework.jdbc.Employee;
import com.springframework.jdbc.EmployeeDAO;

public class JdbcTest2 {

	static ApplicationContext context = new ClassPathXmlApplicationContext("jdbcTemplConfig.xml");
	
	public static void main(String[] args) {
        /*
		Employee employee = new Employee();
		employee.setId(4);
		employee.setFirstName("Gabriela");
		employee.setLastName("Wojnarowicz");
		*/
		EmployeeDAO employeeDAO =  (EmployeeDAO) context.getBean("employeeDAO");				
		//int result = employeeDAO.insert(employee);
		//int result = employeeDAO.update(employee);
		//int result = employeeDAO.delete(employee);
		List<Employee> result = employeeDAO.getAll();
		System.out.println("result: " + result);				
	}

}
