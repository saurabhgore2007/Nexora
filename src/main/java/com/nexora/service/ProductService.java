package com.nexora.service;

import com.nexora.entity.Product;

public interface ProductService {

	Product save(Product product);
	
	Product getById(Long id);
}
