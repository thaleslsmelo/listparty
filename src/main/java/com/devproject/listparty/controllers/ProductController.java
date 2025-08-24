package com.devproject.listparty.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devproject.listparty.dto.ProductDTO;
import com.devproject.listparty.dto.ProductMinDTO;
import com.devproject.listparty.services.ProductService;

@RestController
@RequestMapping(value ="/product")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	
	@GetMapping(value = "/{id}")
	public ProductDTO findById(@PathVariable Long id){
		
		ProductDTO result =  productService.findById(id);
		
		return result;
	}	

	@GetMapping
	public List<ProductMinDTO> findAll(){
		
		List<ProductMinDTO> result =  productService.findAll();
		
		return result;
	}	

}
