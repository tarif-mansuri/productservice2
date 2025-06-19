package com.tarif.productservice2.dtos.products;

import com.tarif.productservice2.models.Product;
import lombok.Data;

@Data
public class CreateProductRequestDto {
    private String title;
    private String description;
    private double price;
    private String categoryName;
    private String imageUrl;

    public Product toProduct() {
        Product product = new Product();
        product.setTitle(title);
        product.setDescription(description);
        product.setPrice(price);
        product.setCategoryName(categoryName);
        product.setImageUrl(imageUrl);
        return product;
    }
}
