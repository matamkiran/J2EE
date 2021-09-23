package com.example.postgresdemo.service;

import java.math.BigInteger;
import java.util.List;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.postgresdemo.model.Product;
import com.example.postgresdemo.repository.IProductDao;
import com.example.postgresdemo.to.request.ProductUpdateDemoRequest;
import com.example.postgresdemo.to.request.ProductUpdateRequest;

	@Service
	public class ProductServiceImpl implements IProductService{
		
		@Autowired	
		private SessionFactory session;
		
		@Autowired 
		private IProductDao iProductDao;
		
		@Override
		@Transactional
		public List<Product> fetchProductsList() {
			return iProductDao.fetchProductsDao(session);
		}

		@Override
		@Transactional
		public Product createProduct(@Valid Product product) {
			// TODO Auto-generated method stub
			return iProductDao.createProductsDao(session,product);
		}

		@Override
		@Transactional
		public Product getProductDetails(Integer id) {
			return iProductDao.fetchProductDetails(session,id);
		}

		@Override
		@Transactional
		public List<Product> getProductDetailsLimit(Integer limit, Integer offset) {
			return iProductDao.fetchProductDetailsLimit(session,limit,offset);
		}

		@Override
		@Transactional
		public BigInteger getProductTotalcount() {
			return iProductDao.getProductTotalcountDao(session);
		}

		@Override
		@Transactional
		public Product getProductDetailsActive(Integer id) {
			// TODO Auto-generated method stub
			return iProductDao.fetchProductDetailsActive(session,id);
		}

	
	}

