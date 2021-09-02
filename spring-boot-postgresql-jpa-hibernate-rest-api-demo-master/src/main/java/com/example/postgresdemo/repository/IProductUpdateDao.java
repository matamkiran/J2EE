package com.example.postgresdemo.repository;

import javax.validation.Valid;

import org.hibernate.SessionFactory;

import com.example.postgresdemo.to.request.ProductUpdateRequest;

public interface IProductUpdateDao {
	
	int updateProductsDao(SessionFactory session, @Valid ProductUpdateRequest product);

}
