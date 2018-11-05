package com.springframework;

import org.springframework.beans.factory.annotation.Autowired;

public class HotelCustomer {

	private int id;
	private String name;
	
	@Autowired
	private HotelReservation hotelReservation;	

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

	public HotelReservation getHotelReservation() {
		return hotelReservation;
	}

	public void setHotelReservation(HotelReservation hotelReservation) {
		this.hotelReservation = hotelReservation;
	}

	@Override
	public String toString() {
		return "HotelCustomer [id=" + id + ", name=" + name + ", hotelReservation=" + hotelReservation + "]";
	}	
}
