package com.springframework;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

	private int id;
	private String name;
	
	@Autowired
	private Address address;

	public Employee(int id, String name) {
		System.out.println("2args constructor");
		this.id = id;
		this.name = name;
	}
	
	public Employee(int id, String name, Address address) {
		System.out.println("3args constructor");
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		System.out.println("setAddress");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
	}		
}
