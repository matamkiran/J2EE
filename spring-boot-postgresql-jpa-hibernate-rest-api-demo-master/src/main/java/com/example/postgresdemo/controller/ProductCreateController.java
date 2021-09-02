package com.example.postgresdemo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.postgresdemo.model.Product;
import com.example.postgresdemo.service.IProductService;

@RestController
public class ProductCreateController {
	
	@Autowired
	private IProductService iProductService;
	
	@PostMapping("/products")
    public Product createProduct(@Valid @RequestBody Product product) {
        return iProductService.createProduct(product);
    }

}
