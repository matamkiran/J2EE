package com.example.postgresdemo.service;

import java.math.BigInteger;
import java.util.List;

import javax.validation.Valid;

import com.example.postgresdemo.model.Product;

public interface IProductService {
	
	List<Product> fetchProductsList();

	Product createProduct(@Valid Product product);

	Product getProductDetails(Integer id);

	List<Product> getProductDetailsLimit(Integer limit, Integer offset);

	BigInteger getProductTotalcount();


}
