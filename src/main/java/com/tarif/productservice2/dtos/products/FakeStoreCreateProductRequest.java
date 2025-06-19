package com.tarif.productservice2.dtos.products;

import lombok.Data;

@Data
public class FakeStoreCreateProductRequest {
    private String title;
    private String description;
    private double price;
    private String category;
    private String image;
}
