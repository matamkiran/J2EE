package com.example.postgresdemo.repository;

import javax.validation.Valid;

import org.hibernate.SessionFactory;

import com.example.postgresdemo.to.request.ProductUpdateDemoRequest;

public interface IProductUpdateDemoDao {

	int updateProductsDao(SessionFactory session, @Valid ProductUpdateDemoRequest product);

}
