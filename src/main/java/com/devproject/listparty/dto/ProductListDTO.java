package com.devproject.listparty.dto;

import com.devproject.listparty.entities.ProductList;

public class ProductListDTO {
	
	private Long id;
	private String names;

	public ProductListDTO() {
		
	}

	public ProductListDTO(ProductList intity) {
		
		id = intity.getId();
		names = intity.getNames();
	}

	public Long getId() {
		return id;
	}

	public String getNames() {
		return names;
	}

}


