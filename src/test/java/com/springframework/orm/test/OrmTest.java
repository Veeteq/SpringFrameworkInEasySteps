package com.springframework.orm.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springframework.orm.Product;
import com.springframework.orm.ProductDAO;

public class OrmTest {

	static ApplicationContext context = new ClassPathXmlApplicationContext("ormConfig.xml");
	
	public static void main(String[] args) {
        Product product = new Product();
        product.setId(5);
        product.setName("Schab");
        product.setDescription("Schab to mięso");
        product.setPrice(13.39);
        
        ProductDAO productDAO = (ProductDAO) context.getBean("productDAO");
        Product result = productDAO.find(2);
        System.out.println("result: " + result);
        
        List<Product> products = productDAO.findAll();
        System.out.println("products: " + products);
	}

}
