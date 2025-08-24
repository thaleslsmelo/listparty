package com.devproject.listparty.dto;

import org.springframework.beans.BeanUtils;

import com.devproject.listparty.entities.Product;

public class ProductDTO {
	
	
	private Long id;
	private String names;
	private Double price;
	private String category;
	private String ramo;
	private String imgUrl;
	private String shortDescription;
	private String LongDescription;
	
	public ProductDTO() {
		
	}
	public ProductDTO(Product entity) {
		BeanUtils.copyProperties(entity, this);
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNames() {
		return names;
	}
	public void setNames(String names) {
		this.names = names;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getRamo() {
		return ramo;
	}
	public void setRamo(String ramo) {
		this.ramo = ramo;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public String getShortDescription() {
		return shortDescription;
	}
	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}
	public String getLongDescription() {
		return LongDescription;
	}
	public void setLongDescription(String longDescription) {
		LongDescription = longDescription;
	}

}
