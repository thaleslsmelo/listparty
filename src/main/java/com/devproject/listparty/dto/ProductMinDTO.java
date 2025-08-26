package com.devproject.listparty.dto;

import com.devproject.listparty.entities.Product;
import com.devproject.listparty.projections.ProductMinProjection;

import jakarta.persistence.Column;

public class ProductMinDTO {
	
	private Long id;
	private String names;
	private Double price;
	private String imgUrl;
	private String nomeLista;
	
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
	public ProductMinDTO(ProductMinProjection projection) {
		
		id = projection.getId();
		names = projection.getNames();
		price = projection.getPrice();
		imgUrl = projection.getImgUrl();
		shortDescription = projection.getShort_description();
		nomeLista = projection.getNomeLista();
		
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

	public String getNomeLista() {
		return nomeLista;
	}
}
