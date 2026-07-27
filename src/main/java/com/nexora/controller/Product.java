package com.nexora.controller;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

public class Product {

	@NotBlank
    private String name;

    @Positive
    private double price;
    
    public void setName(String name) {
    	this.name = name;
    }
    
    public void setPrice(double price) {
    	this.price = price;
    }
    
    public String getName() {
    	return name;
    }
    
    public double getPrice() {
    	return price;
    }
}
