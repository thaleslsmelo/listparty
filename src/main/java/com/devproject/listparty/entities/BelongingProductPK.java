package com.devproject.listparty.entities;

import java.util.Objects;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Embeddable
public class BelongingProductPK {
	
	@ManyToOne
	@JoinColumn(name = "prod_id")
	private Product product;
	
	@ManyToOne
	@JoinColumn(name = "prodList_id")
	private ProductList productList; 
	
	public BelongingProductPK() {
		
	}

	public BelongingProductPK(Product product, ProductList productList) {
		super();
		this.product = product;
		this.productList = productList;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public ProductList getProductList() {
		return productList;
	}

	public void setProductList(ProductList productList) {
		this.productList = productList;
	}

	@Override
	public int hashCode() {
		return Objects.hash(product, productList);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BelongingProductPK other = (BelongingProductPK) obj;
		return Objects.equals(product, other.product) && Objects.equals(productList, other.productList);
	}

}
