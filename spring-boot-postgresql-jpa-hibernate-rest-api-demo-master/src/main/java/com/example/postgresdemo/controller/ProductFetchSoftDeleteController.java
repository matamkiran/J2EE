package com.example.postgresdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.postgresdemo.model.Product;
import com.example.postgresdemo.model.Product;
import com.example.postgresdemo.service.IProductService;

@RestController
public class ProductFetchSoftDeleteController {
	
	@Autowired
	private IProductService iProductService;
	
	@GetMapping("/api/fecth/products/active")
	public Product showProductDetails(@RequestParam("id") Integer id) {
		
		return iProductService.getProductDetailsActive(id);
		
	}
    
}
