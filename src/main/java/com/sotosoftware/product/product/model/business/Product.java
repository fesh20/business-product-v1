package com.sotosoftware.product.product.model.business;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class Product {

    private Long id;
    //@Column(name = "productName")
    private String name;
    private String category;
    private double price;

}
