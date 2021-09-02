package com.example.postgresdemo.to.request;

import java.math.BigInteger;
import java.util.List;

import com.example.postgresdemo.model.Product;

/**
 * Fetch listing with total count  and able to apply limit and offset 
 * @author bhanu
 *
 */
public class ProductListingResponse {
	
	List<Product> productList;
	BigInteger totalCount;
	
	
	public List<Product> getProductList() {
		return productList;
	}
	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}
	public BigInteger getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(BigInteger totalCount) {
		this.totalCount = totalCount;
	}
	

}
