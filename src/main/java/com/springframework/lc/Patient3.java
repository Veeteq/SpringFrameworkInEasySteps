package com.springframework.lc;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Required;

public class Patient3 {

	private int id;
	private String name;

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
	
	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + "]";
	}

	@PostConstruct
	public void sayHello() {
		System.out.println("Patient3 Hello");
	}
	
	@PreDestroy
	public void sayBye() {
		System.out.println("Patient3 Bye");
	}
}