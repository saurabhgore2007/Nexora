package com.nexora.service.impl;

import org.springframework.stereotype.Service;

import com.nexora.entity.Product;
import com.nexora.repository.ProductRepository;
import com.nexora.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{

	private final ProductRepository productRepository;
	
	public ProductServiceImpl(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}
	
	@Override
	public Product save(Product product) {
		return productRepository.save(product);
	}

	@Override
	public Product getById(Long id) {

		return productRepository.findById(id)
					.orElseThrow(() -> new RuntimeException("Product not found"));
	}
}
