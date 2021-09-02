package com.example.postgresdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.postgresdemo.service.IProductService;
import com.example.postgresdemo.to.request.ProductListingResponse;

@RestController
public class ProductFetchWithLimitOffsetController {
	
	@Autowired
	private IProductService iProductService;
	
	@RequestMapping("/api/fecth/products/{limit}/{offset}")
	public ProductListingResponse showProductDetails(@PathVariable("limit") Integer limit,@PathVariable("offset") Integer offset) {
		ProductListingResponse productListingResponse= new ProductListingResponse();
		
		productListingResponse.setProductList(iProductService.getProductDetailsLimit(limit,offset));
		
		productListingResponse.setTotalCount(iProductService.getProductTotalcount());
		return productListingResponse;
		
	}
	

}
