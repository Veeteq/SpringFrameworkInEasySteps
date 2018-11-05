package com.springframework.interfaces;

import org.springframework.stereotype.Component;

@Component("orderDAO2")
public class OrderDAOImpl2 implements OrderDAO{

	@Override
	public void createOrder() {
		System.out.println("creating order v2");
	}

}
