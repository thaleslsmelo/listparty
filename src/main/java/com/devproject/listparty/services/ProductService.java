package com.devproject.listparty.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devproject.listparty.dto.ProductDTO;
import com.devproject.listparty.dto.ProductMinDTO;
import com.devproject.listparty.entities.Product;
import com.devproject.listparty.projections.ProductMinProjection;
import com.devproject.listparty.repositories.ProductRepository;

@Service
public class ProductService {

	
	@Autowired
	private ProductRepository productRepository;
	
	@Transactional(readOnly = true)
	public ProductDTO findById(Long id) {
		Product result = productRepository.findById(id).get();
		return new ProductDTO(result);
	}
	
	@Transactional(readOnly = true)
	public List<ProductMinDTO> findAll(){
		
		List<Product> result =  productRepository.findAll();
		List<ProductMinDTO> dto = result.stream().map(x -> new ProductMinDTO(x)).toList();
		return dto;
		
		
	}
	
	@Transactional(readOnly = true)
	public List<ProductMinDTO> findByList(Long listId){
		
		List<ProductMinProjection> result =  productRepository.searchByList(listId);
		List<ProductMinDTO> dto = result.stream().map(x -> new ProductMinDTO(x)).toList();
		return dto;
		
		
	}
}
