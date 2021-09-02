package com.example.postgresdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.postgresdemo.model.Product;
import com.example.postgresdemo.service.IProductService;

@RestController
public class ProductFetchPathVariableDemoController {
	
	@Autowired
	private IProductService iProductService;
	
	@RequestMapping("/path/fecth/products/{id}")
	public Product showProductDetails(@PathVariable("id") Integer id) {
		
		return iProductService.getProductDetails(id);
		
	}

}
