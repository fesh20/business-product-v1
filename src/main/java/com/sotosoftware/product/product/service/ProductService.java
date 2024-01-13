package com.sotosoftware.product.product.service;

import com.sotosoftware.product.product.model.business.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    Product findById(Long id);
    List<Product> finAll();
    void save();
    void update();
    void delete();

}
