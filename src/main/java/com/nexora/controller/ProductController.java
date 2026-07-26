package com.nexora.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
public class ProductController {

	@GetMapping
    public ResponseEntity<String> getProducts(){

        return ResponseEntity.ok("All Products");

    }
	
	@GetMapping("/{id}")
	public ResponseEntity<String> getProductsById(@PathVariable Long id){

        return ResponseEntity.ok("Products By Id : " + id);

    }
	
	@PostMapping
	public ResponseEntity<String> addProducts() {
		return ResponseEntity.ok("Product Created");
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<String> updateProducts(@PathVariable Long id) {
		return ResponseEntity.ok("Updated Products " + id);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteProducts(@PathVariable Long id) {
		return ResponseEntity.ok("Deleted Products " + id);
	}
	
	
}
