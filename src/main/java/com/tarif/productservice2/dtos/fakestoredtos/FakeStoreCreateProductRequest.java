package com.tarif.productservice2.dtos.fakestoredtos;

import com.tarif.productservice2.models.Product;
import lombok.Data;

@Data
public class FakeStoreCreateProductRequest {
    private FakeStoreRequestDto product;

    public static FakeStoreCreateProductRequest fromProduct(Product product) {
        FakeStoreCreateProductRequest fakeStoreCreateProductRequest = new FakeStoreCreateProductRequest();
        fakeStoreCreateProductRequest.setProduct(FakeStoreRequestDto.toFakeStoreRequestDto(product));
        return fakeStoreCreateProductRequest;
    }
}
