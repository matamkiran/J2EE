package com.example.postgresdemo.repository.implementation;

import javax.validation.Valid;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.example.postgresdemo.model.Product;
import com.example.postgresdemo.repository.IProductUpdateDao;
import com.example.postgresdemo.to.request.ProductUpdateRequest;

@Repository
public class ProductUpdateDaoImpl implements IProductUpdateDao{

	@Override
	public int updateProductsDao(SessionFactory session, @Valid ProductUpdateRequest product) {
		return session.getCurrentSession().createSQLQuery("UPDATE products set name=:name ,price=:price where id=:id")
				.setParameter("price", product.getPrice())
				.setParameter("name", product.getName())
				.setParameter("id", product.getId())
				.executeUpdate();
		
	}

	

}
