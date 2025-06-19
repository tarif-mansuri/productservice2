package com.tarif.productservice2.dtos.products;

import com.tarif.productservice2.models.Product;
import lombok.Data;

@Data
public class CreateProductResponseDto {
    private Long id;
    private String title;
    private String description;
    private double price;
    private String category;
    private String imageUrl;

    public static  CreateProductResponseDto fromProduct(Product product) {
        CreateProductResponseDto responseDto = new CreateProductResponseDto();
        responseDto.setId(product.getId());
        responseDto.setTitle(product.getTitle());
        responseDto.setDescription(product.getDescription());
        responseDto.setPrice(product.getPrice());
        responseDto.setCategory(product.getCategoryName());
        responseDto.setImageUrl(product.getImageUrl());
        return responseDto;
    }
}
