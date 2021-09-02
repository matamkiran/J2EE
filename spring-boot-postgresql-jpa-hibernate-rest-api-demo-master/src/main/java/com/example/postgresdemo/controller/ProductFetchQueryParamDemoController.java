package com.example.postgresdemo.controller;

import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.postgresdemo.model.Product;
import com.example.postgresdemo.service.IProductService;

@RestController
public class ProductFetchQueryParamDemoController {
	
	@Autowired
	private IProductService iProductService;
	
	@RequestMapping("/fecth/products")
	public Product showProductDetails(@QueryParam("id") Integer id) {
		
		return iProductService.getProductDetails(id);
		
	}
	
}
