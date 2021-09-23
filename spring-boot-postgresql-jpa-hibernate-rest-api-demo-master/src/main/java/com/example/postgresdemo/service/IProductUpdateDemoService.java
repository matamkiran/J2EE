package com.example.postgresdemo.service;

import javax.validation.Valid;

import com.example.postgresdemo.to.request.ProductUpdateDemoRequest;

public interface IProductUpdateDemoService {
	
	int updateProduct(@Valid ProductUpdateDemoRequest product);


}
