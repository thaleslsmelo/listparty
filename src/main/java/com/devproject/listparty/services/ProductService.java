package com.devproject.listparty.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devproject.listparty.dto.ProductMinDTO;
import com.devproject.listparty.entities.Product;
import com.devproject.listparty.repositories.ProductRepository;

@Service
public class ProductService {

	
	@Autowired
	private ProductRepository productRepository;
	
	public List<ProductMinDTO> findAll(){
		
		List<Product> result =  productRepository.findAll();
		List<ProductMinDTO> dto = result.stream().map(x -> new ProductMinDTO(x)).toList();
		return dto;
		
		
	}
}
