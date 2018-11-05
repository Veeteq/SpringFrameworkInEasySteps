package com.springframework.advanced;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value="inst")
@Scope(value="prototype")
public class Instructor {

	@Value("#{new Integer(88)}")
	private int id;
	
	@Value("#{'Witek W'.toUpperCase()}")
	private String name;

	@Value("#{topics}")
	private List<String> topics;
	
	@Autowired
	private Profile profile;
	
	@Value("#{1+3>5}")
	private boolean active;
	
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

	@Override
	public String toString() {
		return "Instructor [id=" + id + ", name=" + name + ", topics=" + topics + ", profile=" + profile + ", active="
				+ active + "]";
	}
}
