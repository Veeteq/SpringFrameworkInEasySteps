package com.springframework.orm;

import java.util.List;

public interface ProductDAO {

	int create(Product product);  
	void update(Product product);
	void delete(Product product);
	Product find(int id);
	List<Product> findAll();
}
