package com.devproject.listparty.dto;

import com.devproject.listparty.entities.Product;

import jakarta.persistence.Column;

public class ProductMinDTO {
	
	private Long id;
	private String names;
	private Double price;
	private String imgUrl;
	
	@Column(columnDefinition = "TEXT")
	private String shortDescription;
	
	public ProductMinDTO() {
	}

	public ProductMinDTO(Product entity) {
		
		id = entity.getId();
		names = entity.getnames();
		price = entity.getPrice();
		imgUrl = entity.getImgUrl();
		shortDescription = entity.getShortDescription();
	}

	public Long getId() {
		return id;
	}

	public String getNames() {
		return names;
	}

	public Double getPrice() {
		return price;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}
	
}
