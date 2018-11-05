package com.springframework.interfaces;

import org.springframework.stereotype.Component;

@Component("orderDAO1")
public class OrderDAOImpl implements OrderDAO {

	@Override
	public void createOrder() {
		System.out.println("creating order");
	}

}
