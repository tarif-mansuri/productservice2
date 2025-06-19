package com.tarif.productservice2.services.productservice;

import com.tarif.productservice2.models.Product;

public interface ProductService {
//    void createProduct(String title, String description, double price, String category,
//                       String imageUrl);
    Product createProduct(Product product);
}
