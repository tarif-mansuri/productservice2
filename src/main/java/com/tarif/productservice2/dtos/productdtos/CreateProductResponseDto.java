package com.tarif.productservice2.dtos.productdtos;

import com.tarif.productservice2.models.Product;
import lombok.Data;

@Data
public class CreateProductResponseDto {

    private ProductRequestDto product;

    public static  CreateProductResponseDto fromProduct(Product product) {
        CreateProductResponseDto responseDto = new CreateProductResponseDto();
        responseDto.setProduct(ProductRequestDto.toProductRequestDto(product));
        return responseDto;
    }

    public Product toProduct() {
        return product.toProduct();
    }
}
