package com.example.postgresdemo.repository.implementation;

import javax.validation.Valid;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.example.postgresdemo.repository.IProductUpdateDemoDao;
import com.example.postgresdemo.to.request.ProductUpdateDemoRequest;

@Repository
public class ProductUpdateDemoDaoImpl implements IProductUpdateDemoDao {

	
	@Override
	public int updateProductsDao(SessionFactory session, @Valid ProductUpdateDemoRequest product) {
		// TODO Auto-generated method stub
		return session.getCurrentSession().createSQLQuery("UPDATE products set name=:name ,price=:price where id=:id")
				.setParameter("price", product.getPrice())
				.setParameter("name", product.getName())
				.setParameter("id", product.getId())
				.executeUpdate();
	}

}
