package com.sotosoftware.product.product.service.impl;

import com.sotosoftware.product.product.dao.ProductRepository;
import com.sotosoftware.product.product.mapper.ProductMapper;
import com.sotosoftware.product.product.model.business.Product;
import com.sotosoftware.product.product.model.dto.ProductDTO;
import com.sotosoftware.product.product.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
//@AllArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductMapper productMapper;
    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductMapper productMapper, ProductRepository productRepository) {
        this.productMapper = productMapper;
        this.productRepository = productRepository;
    }


    @Override
    public Product findById(Long id) {
       Optional<ProductDTO> productDTOOptional = productRepository.findById(id);
        return productDTOOptional.map(productDTO -> {
            /*Product product = new Product();
            product.setId(productDTO.getId());
            product.setName(productDTO.getName());
            return product;
            return productDTOOptional.map(productMapper::productDTOToProduct).orElse(null);
            */
            return productMapper.productDTOToProduct(productDTO);
        }).orElse(null);
    }

    @Override
    public List<Product> finAll() {
        return null;
    }

    @Override
    public void save() {

    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }
}
