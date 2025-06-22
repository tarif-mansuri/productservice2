package com.tarif.productservice2.dtos.productdtos;

import com.tarif.productservice2.models.Product;
import lombok.Data;

@Data
public class DeleteProductResponseDto {
    private ProductResponseDto product;
    public static DeleteProductResponseDto toDeleteProductResponseDto(Product product) {
        DeleteProductResponseDto deleteProductResponseDto = new DeleteProductResponseDto();
        deleteProductResponseDto.setProduct(ProductResponseDto.toProductResponseDto(product));
        return deleteProductResponseDto;
    }

    public Product toProduct() {
        return product.toProduct();
    }
}
