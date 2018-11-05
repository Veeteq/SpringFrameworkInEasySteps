package com.springframework.interfaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component(value="orderBO")
public class OrderBOImpl implements OrderBO {

	@Autowired
	@Qualifier("orderDAO2")
	private OrderDAO orderDAO;
	
	@Override
	public void placeOrder() {
		System.out.println("Placing order");
		getOrderDAO().createOrder();
	}

	public OrderDAO getOrderDAO() {
		return orderDAO;
	}

	public void setOrderDAO(OrderDAO orderDAO) {
		this.orderDAO = orderDAO;
	}
}
