package com.springframework;

import java.util.Date;

public class HotelReservation {

	private int id;
	private Date arrival;
/*
	public HotelReservation(int id, Date arrival) {
		this.id = id;
		this.arrival = arrival;
	}
*/
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getArrival() {
		return arrival;
	}

	public void setArrival(Date arrival) {
		this.arrival = arrival;
	}
	
	@Override
	public String toString() {
		return "Reservation [id=" + id + ", arrival=" + arrival + "]";
	}
}
