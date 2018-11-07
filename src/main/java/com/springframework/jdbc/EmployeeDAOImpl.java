package com.springframework.jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component(value="employeeDAO")
public class EmployeeDAOImpl implements EmployeeDAO{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int insert(Employee employee) {
		String sql = "insert into employee values(?,?,?)";
		int result = jdbcTemplate.update(sql, employee.getId(), employee.getFirstName(), employee.getLastName());
		return result;		
	}

	@Override
	public int update(Employee employee) {
		String sql = "update employee set firstname=?, lastname=? where id=?";
		int result = jdbcTemplate.update(sql, employee.getFirstName(), employee.getLastName(), employee.getId());
		return result;	
	}

	@Override
	public int delete(Employee employee) {
		String sql = "delete from employee where id=?";
		int result = jdbcTemplate.update(sql, employee.getId());
		return result;
	}

	@Override
	public Employee getbyId(int id) {
		String sql = "select * from employee where id=?";
		Employee employee = jdbcTemplate.queryForObject(sql, new EmployeeRowMapper(), id);
		return employee;
	}

	@Override
	public List<Employee> getAll() {
		String sql = "select * from employee";
		List<Employee> employees = jdbcTemplate.query(sql, new EmployeeRowMapper());
		return employees;
	}	
}
