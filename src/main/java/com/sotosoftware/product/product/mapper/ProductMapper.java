package com.sotosoftware.product.product.mapper;

import com.sotosoftware.product.product.model.business.Product;
import com.sotosoftware.product.product.model.dto.ProductDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    Product productDTOToProduct(ProductDTO productDto);

    ProductDTO productToProductDTO(Product product);

    List<Product> productDTOToProduct( List<ProductDTO> productDto);
}
