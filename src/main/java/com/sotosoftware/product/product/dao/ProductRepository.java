package com.sotosoftware.product.product.dao;

import com.sotosoftware.product.product.model.dto.ProductDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<ProductDTO,Long> {

}
