package com.springframework.lc;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class TicketReservation {

	private int id;	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@PostConstruct
	public void initialize() {
		System.out.println("initialize");
	}
	
	@PreDestroy
	public void cleanUp() {
		System.out.println("cleanUp");
	}
}
