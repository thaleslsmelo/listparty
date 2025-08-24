package com.devproject.listparty.entities;

import java.util.Objects;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_belonging")
public class BelongingProduct {
	
	@EmbeddedId
	private BelongingProductPK id = new BelongingProductPK();
	
	private Integer position;

	public BelongingProduct() {
		
	}

	public BelongingProduct(Product product, ProductList productList, Integer position) {
		
		id.setProduct(product);
		id.setProductList(productList);
		this.position = position;
	}

	public BelongingProductPK getId() {
		return id;
	}

	public void setId(BelongingProductPK id) {
		this.id = id;
	}

	public Integer getPosition() {
		return position;
	}

	public void setPosition(Integer position) {
		this.position = position;
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
		BelongingProduct other = (BelongingProduct) obj;
		return Objects.equals(id, other.id);
	}
	
}
