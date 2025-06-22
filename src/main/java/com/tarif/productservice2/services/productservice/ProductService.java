package com.tarif.productservice2.services.productservice;

import com.tarif.productservice2.models.Product;

import java.util.List;

public interface ProductService {
//    void createProduct(String title, String description, double price, String category,
//                       String imageUrl);
    Product createProduct(Product product);
    List<Product> getAllProducts();
    Product getProductById(Long id);
    Product updateProduct(Long id, Product product);
    void deleteProduct(Long id);
}
