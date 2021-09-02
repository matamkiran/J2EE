package com.example.postgresdemo.repository;

import java.math.BigInteger;
import java.util.List;

import javax.validation.Valid;

import org.hibernate.SessionFactory;

import com.example.postgresdemo.model.Product;

public interface IProductDao {
	
	List<Product> fetchProductsDao(SessionFactory session);

	Product createProductsDao(SessionFactory session, @Valid Product product);

	Product fetchProductDetails(SessionFactory session, Integer id);

	List<Product> fetchProductDetailsLimit(SessionFactory session, Integer limit, Integer offset);

	BigInteger getProductTotalcountDao(SessionFactory session);

}
