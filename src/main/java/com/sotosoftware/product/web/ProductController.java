package com.sotosoftware.product.web;

import com.sotosoftware.product.product.dao.ProductRepository;
import com.sotosoftware.product.product.model.business.Product;
import com.sotosoftware.product.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600) //para manejar las politicas de seguridad
@RestController //controlador -> restcontroller servicio res (json)
@RequestMapping("/v1/api/product")
public class ProductController {

    @Autowired
    private  ProductService productService;


    @GetMapping("/findById/{id}")
    public Product findById(@PathVariable("id") Long id){
      return productService.findById(id);
    }

}
