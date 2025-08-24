package com.devproject.listparty.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devproject.listparty.dto.ProductListDTO;
import com.devproject.listparty.dto.ProductMinDTO;
import com.devproject.listparty.services.ProductListService;
import com.devproject.listparty.services.ProductService;

@RestController
@RequestMapping(value ="/lists")
public class ProductListController {
	
	@Autowired
	private ProductListService productListService;
	
	@Autowired
	private ProductService productService;
	

	@GetMapping
	public List<ProductListDTO> findAll(){
		
		List<ProductListDTO> result =  productListService.findAll();
		
		return result;
	}	

	@GetMapping(value = "/{listId}/product")
	public List<ProductMinDTO> findByList(@PathVariable Long listId){
		
		List<ProductMinDTO> result =  productService.findByList(listId);
		return result;
	}	
}
