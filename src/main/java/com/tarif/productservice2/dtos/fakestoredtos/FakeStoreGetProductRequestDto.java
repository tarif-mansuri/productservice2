package com.tarif.productservice2.dtos.fakestoredtos;

import com.tarif.productservice2.models.Product;
import lombok.Data;

@Data
public class FakeStoreGetProductRequestDto {

    private FakeStoreRequestDto product;

    public Product toProduct() {
        return product.toProduct();
    }

    public static FakeStoreGetProductRequestDto toFakeStoreGetProductRequestDto(Product product) {
        FakeStoreGetProductRequestDto fakeStoreGetProductRequestDto = new FakeStoreGetProductRequestDto();
        fakeStoreGetProductRequestDto.setProduct(FakeStoreRequestDto.toFakeStoreRequestDto(product));
        return fakeStoreGetProductRequestDto;
    }
}
