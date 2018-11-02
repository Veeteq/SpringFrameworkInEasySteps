package com.springframework;

import org.springframework.beans.factory.annotation.Required;

public class University {

	private int id;
	private String name;
	private Address address;

	public int getId() {
		return id;
	}

	@Required
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
		this.address = address;
	}

	@Override
	public String toString() {
		return "University [id=" + id + ", name=" + name + ", address=" + address + ", hashCode=" + hashCode() +"]";
	}
}
