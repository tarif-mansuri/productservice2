package com.tarif.productservice2.dtos.fakestoredtos;

import com.tarif.productservice2.models.Category;
import com.tarif.productservice2.models.Product;
import lombok.Data;

@Data
public class FakeStoreRequestDto {
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

    public static FakeStoreRequestDto toFakeStoreRequestDto(Product product) {
        FakeStoreRequestDto fakeStoreRequestDto = new FakeStoreRequestDto();
        fakeStoreRequestDto.setTitle(product.getTitle());
        fakeStoreRequestDto.setDescription(product.getDescription());
        fakeStoreRequestDto.setPrice(product.getPrice());
        fakeStoreRequestDto.setCategory(product.getCategory());
        fakeStoreRequestDto.setImage(product.getImageUrl());
        return fakeStoreRequestDto;
    }
}
