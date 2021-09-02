package com.example.postgresdemo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.postgresdemo.service.IProductUpdateService;
import com.example.postgresdemo.to.request.ProductUpdateRequest;
import com.example.postgresdemo.to.request.ProductUpdateResponse;
/**
 * ProductUpdateController
 * @author matam
 *
 */
@RestController
public class ProductUpdateController {
	
	@Autowired
	private IProductUpdateService iProductDemoService;
	
	@PostMapping("/api/products/update")
    public ProductUpdateResponse updateProduct(@Valid @RequestBody ProductUpdateRequest product) {
        ProductUpdateResponse obj= new ProductUpdateResponse();

		obj.setRows(iProductDemoService.updateProduct(product));
		obj.setResponseMsg("updated successfully");
        return obj;
    }
	

}
