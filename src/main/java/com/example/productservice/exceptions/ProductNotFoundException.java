package com.example.productservice.exceptions;

public class ProductNotFoundException extends Exception {
	public ProductNotFoundException(int id) {
		super("Product with id " + id + " not found");
	}

	
}
