package com.tarif.productservice2.dtos.productdtos;

import com.tarif.productservice2.models.Category;
import com.tarif.productservice2.models.Product;
import lombok.Data;

@Data
public class ProductRequestDto {
    private String title;
    private String description;
    private double price;
    private Category category;
    private String imageUrl;

    public static ProductRequestDto toProductRequestDto(Product product) {
        ProductRequestDto dto = new ProductRequestDto();
        dto.setTitle(product.getTitle());
        dto.setDescription(product.getDescription());
        dto.setPrice(product.getPrice());
        dto.setCategory(product.getCategory());
        dto.setImageUrl(product.getImageUrl());
        return dto;
    }

    public Product toProduct() {
        Product product = new Product();
        product.setTitle(title);
        product.setDescription(description);
        product.setPrice(price);
        product.setCategory(category);
        product.setImageUrl(imageUrl);
        return product;
    }
}
