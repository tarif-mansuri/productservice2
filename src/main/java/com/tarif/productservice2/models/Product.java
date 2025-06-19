package com.tarif.productservice2.models;

import lombok.Data;

@Data
public class Product {
    private Long id;
    private String title;
    private String description;
    private double price;
    private String categoryName;
    private String imageUrl;
}
