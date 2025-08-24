package com.devproject.listparty.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devproject.listparty.entities.Product;
import com.devproject.listparty.projections.ProductMinProjection;


public interface ProductRepository extends JpaRepository<Product, Long>{
	
	@Query(nativeQuery = true, value = """
			SELECT tb_product.id, tb_product.names, tb_product.price , tb_product.img_url AS imgUrl,
			tb_product.short_description , tb_belonging.position, tb_product_list.names As nomeLista
			FROM tb_product, tb_belonging, tb_product_list 
                WHERE tb_product.id = tb_belonging.prod_id
                AND tb_product_list.id = tb_belonging.prod_list_id
				AND tb_belonging.prod_list_id= :listId
				ORDER BY tb_belonging.position
			""")
			List<ProductMinProjection> searchByList(Long listId);
}
