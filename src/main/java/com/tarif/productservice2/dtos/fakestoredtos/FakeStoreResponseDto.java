package com.tarif.productservice2.dtos.fakestoredtos;

import com.tarif.productservice2.models.Category;
import com.tarif.productservice2.models.Product;
import lombok.Data;

@Data
public class FakeStoreResponseDto {
    private Long id;
    private String title;
    private String description;
    private double price;
    private Category category;
    private String image;

    public Product toProduct() {
        Product product = new Product();
        product.setTitle(title);
        product.setDescription(description);
        product.setPrice(price);
        product.setCategory(category);
        product.setImageUrl(image);
        return product;
    }

    public static FakeStoreResponseDto toFakeStoreResponseDto(Product product) {
        FakeStoreResponseDto fakeStoreResponseDto = new FakeStoreResponseDto();
        fakeStoreResponseDto.setTitle(product.getTitle());
        fakeStoreResponseDto.setDescription(product.getDescription());
        fakeStoreResponseDto.setPrice(product.getPrice());
        fakeStoreResponseDto.setCategory(product.getCategory());
        fakeStoreResponseDto.setImage(product.getImageUrl());
        return fakeStoreResponseDto;
    }
}
