package com.example.postgresdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.postgresdemo.model.Product;
import com.example.postgresdemo.service.IProductService;

@RestController
public class PController {
	
	@Autowired
	private IProductService iProductService;
	
	@GetMapping("my/products")
	public List<Product> getProducts(){
		return iProductService.fetchProductsList();
	}

}
