package com.example.postgresdemo.service;

import javax.validation.Valid;

import com.example.postgresdemo.model.Product;
import com.example.postgresdemo.to.request.ProductUpdateRequest;

public interface IProductUpdateService {
	
	int updateProduct(@Valid ProductUpdateRequest product);

}
