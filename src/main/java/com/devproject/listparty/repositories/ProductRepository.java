package com.devproject.listparty.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devproject.listparty.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
