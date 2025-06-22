package com.tarif.productservice2.dtos.fakestoredtos;

import com.tarif.productservice2.models.Product;
import lombok.Data;

@Data
public class FakeStoreGetProductResponseDto {

    private FakeStoreResponseDto product;

    public Product toProduct() {
        return product.toProduct();
    }

    public static FakeStoreGetProductResponseDto toFakeStoreGetProductRequestDto(Product product) {
        FakeStoreGetProductResponseDto fakeStoreGetProductRequestDto = new FakeStoreGetProductResponseDto();
        fakeStoreGetProductRequestDto.setProduct(FakeStoreResponseDto.toFakeStoreResponseDto(product));
        return fakeStoreGetProductRequestDto;
    }
}
