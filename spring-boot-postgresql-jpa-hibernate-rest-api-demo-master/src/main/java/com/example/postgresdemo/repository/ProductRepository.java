package com.example.postgresdemo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.postgresdemo.model.Product;

@Repository
public interface ProductRepository {
	
	List<Product> findByProductId(Long productId);

}
