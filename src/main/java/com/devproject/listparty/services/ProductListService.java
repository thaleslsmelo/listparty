package com.devproject.listparty.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devproject.listparty.dto.ProductListDTO;
import com.devproject.listparty.entities.ProductList;
import com.devproject.listparty.repositories.ProductListRepository;

@Service
public class ProductListService {

	
	@Autowired
	private ProductListRepository productListRepository;
	

	@Transactional(readOnly = true)
	public List<ProductListDTO> findAll(){
		
		List<ProductList> result =  productListRepository.findAll();
		return result.stream().map(x -> new ProductListDTO(x)).toList();
		
		
		
	}
}
