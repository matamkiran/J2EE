package com.example.postgresdemo.service;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.postgresdemo.model.Product;
import com.example.postgresdemo.repository.IProductUpdateDao;
import com.example.postgresdemo.to.request.ProductUpdateRequest;

@Service
public class ProductUpdateServiceImpl implements IProductUpdateService {
	
	@Autowired	
	private SessionFactory session;
	
	@Autowired 
	private IProductUpdateDao iProductUpdateDao;

	@Override
	@Transactional
	public int updateProduct(@Valid ProductUpdateRequest product) {
		// TODO Auto-generated method stub
		return iProductUpdateDao.updateProductsDao(session,product);
	}

}
