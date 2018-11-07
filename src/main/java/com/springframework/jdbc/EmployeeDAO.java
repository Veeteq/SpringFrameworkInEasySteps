package com.springframework.jdbc;

import java.util.List;

public interface EmployeeDAO {

	int insert(Employee employee);
	int update(Employee employee);
	int delete(Employee employee);
	Employee getbyId(int id);
	List<Employee> getAll();
}
