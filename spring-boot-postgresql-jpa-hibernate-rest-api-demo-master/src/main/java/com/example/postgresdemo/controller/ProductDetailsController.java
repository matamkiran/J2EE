package com.example.postgresdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.postgresdemo.model.Product;
import com.example.postgresdemo.service.IProductService;

@RestController
public class ProductDetailsController {
	
	@Autowired
	private IProductService iProductService;
	
	@RequestMapping("/products")
	public Product showProductDetails(@RequestParam("id") Integer id) {
		
		return iProductService.getProductDetails(id);
		
	}

}
