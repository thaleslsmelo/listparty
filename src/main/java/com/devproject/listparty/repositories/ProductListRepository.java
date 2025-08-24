package com.devproject.listparty.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devproject.listparty.entities.ProductList;

public interface ProductListRepository extends JpaRepository<ProductList, Long>{

}
