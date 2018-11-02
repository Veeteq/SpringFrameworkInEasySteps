package com.springframework.test.ls;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springframework.lc.TicketReservation;

public class TicketReservationTest {

	static AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springframework/lc/springconfig.xml");
	
	public static void main(String[] args) {
		TicketReservation ticketReservation = (TicketReservation) context.getBean("ticketReservation");
		System.out.println(ticketReservation.getId());
		context.registerShutdownHook();
	}
	
}
