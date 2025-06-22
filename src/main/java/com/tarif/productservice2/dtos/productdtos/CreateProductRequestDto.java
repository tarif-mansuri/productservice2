package com.tarif.productservice2.dtos.productdtos;

import com.tarif.productservice2.models.Product;
import lombok.Data;

@Data
public class CreateProductRequestDto {
    private ProductRequestDto product;

    public Product toProduct() {
        return product.toProduct();
    }

    public static CreateProductRequestDto toCreateProductRequestDto(Product product) {
        CreateProductRequestDto requestDto = new CreateProductRequestDto();
        requestDto.setProduct(ProductRequestDto.toProductRequestDto(product));
        return requestDto;
    }
}
