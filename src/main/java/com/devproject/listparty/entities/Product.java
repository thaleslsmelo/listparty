package com.devproject.listparty.entities;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_product")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private Double price;
	private String category;
	private String ramo;
	private String imgUrl;
	private String shortDescription;
	private String LongDescription;
	
 public Product() {
		}

 public Product(Long id, String name, Double price, String category, String ramo, String imgUrl, String shortDescription,
		String longDescription) {
	
	this.id = id;
	this.name = name;
	this.price = price;
	this.category = category;
	this.ramo = ramo;
	this.imgUrl = imgUrl;
	this.shortDescription = shortDescription;
	this.LongDescription = longDescription;
 }

 public Long getId() {
	return id;
 }

 public void setId(Long id) {
	this.id = id;
 }

 public String getName() {
	return name;
 }

 public void setName(String name) {
	this.name = name;
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

 @Override
 public int hashCode() {
	return Objects.hash(id);
 }

 @Override
 public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Product other = (Product) obj;
	return Objects.equals(id, other.id);
 }

 
}
