package com.tarif.productservice2.dtos.fakestoredtos;

import com.tarif.productservice2.models.Product;
import lombok.Data;

@Data
public class FakeSToreCreateProductResponseDto {
    private FakeStoreRequestDto product;

    public Product toProduct() {
        return product.toProduct();
    }

    public static FakeSToreCreateProductResponseDto toFakeSToreCreateProductResponseDto(Product product) {
        FakeSToreCreateProductResponseDto dto = new FakeSToreCreateProductResponseDto();
        dto.product = FakeStoreRequestDto.toFakeStoreRequestDto(product);
        return dto;
    }
}
