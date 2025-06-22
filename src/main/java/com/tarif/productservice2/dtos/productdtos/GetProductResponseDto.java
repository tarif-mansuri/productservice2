package com.tarif.productservice2.dtos.productdtos;

import com.tarif.productservice2.models.Product;
import lombok.Data;

@Data
public class GetProductResponseDto {

    private ProductRequestDto product;

    public static GetProductResponseDto toGetProductResponseDto(Product product) {
        GetProductResponseDto dto = new GetProductResponseDto();
        dto.setProduct(ProductRequestDto.toProductRequestDto(product));
        return dto;
    }

    public Product toProduct() {
        return product.toProduct();
    }
}
