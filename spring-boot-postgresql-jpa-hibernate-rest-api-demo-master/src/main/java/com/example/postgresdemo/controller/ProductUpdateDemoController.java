package com.example.postgresdemo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.postgresdemo.service.IProductUpdateDemoService;
import com.example.postgresdemo.to.request.ProductUpdateDemoRequest;
import com.example.postgresdemo.to.request.ProductUpdateDemoResponse;
import com.example.postgresdemo.to.request.ProductUpdateRequest;
import com.example.postgresdemo.to.request.ProductUpdateResponse;

@RestController
public class ProductUpdateDemoController {
	
	@Autowired
	private IProductUpdateDemoService iProductUpdateDemoService;
	
	@PostMapping("/api/products/demo/update")
	public ProductUpdateDemoResponse updateProduct(@Valid @RequestBody ProductUpdateDemoRequest product) {
        ProductUpdateDemoResponse obj= new ProductUpdateDemoResponse();
        obj.setRows(iProductUpdateDemoService.updateProduct(product));
		obj.setResponseMsg("updated successfully");
		return obj;
	}


}
