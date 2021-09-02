package com.example.postgresdemo.repository;

import java.math.BigInteger;
import java.util.List;

import javax.validation.Valid;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.example.postgresdemo.model.Product;

@Repository
public class ProductsDaoImplementation implements IProductDao{

	@Override
	public List<Product> fetchProductsDao(SessionFactory session) {
		// TODO Auto-generated method stub
		return session.getCurrentSession().createQuery("From Product").list();
	}

	@Override
	public Product createProductsDao(SessionFactory session, @Valid Product product) {
		// TODO Auto-generated method stub
		session.getCurrentSession().saveOrUpdate(product);
		
		return product;
	}

	@Override
	public Product fetchProductDetails(SessionFactory session, Integer id) {
		return (Product) session.getCurrentSession().createQuery("From Product WHERE id=:id")
				.setParameter("id", id).uniqueResult();
	}

	@Override
	public List<Product> fetchProductDetailsLimit(SessionFactory session, Integer limit, Integer offset) {
		return session.getCurrentSession().createQuery("From Product")
				.setMaxResults(limit)
				.setFirstResult(offset)
				.list();
	}

	@Override
	public BigInteger getProductTotalcountDao(SessionFactory session) {
		return (BigInteger) session.getCurrentSession().createSQLQuery("select count(1) from products").uniqueResult();
	}
}
