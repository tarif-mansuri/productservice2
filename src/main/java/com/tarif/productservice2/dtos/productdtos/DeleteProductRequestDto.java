package com.tarif.productservice2.dtos.productdtos;

import com.tarif.productservice2.models.Product;
import lombok.Data;

@Data
public class DeleteProductRequestDto {
    private ProductRequestDto product;

    public static DeleteProductRequestDto toDeleteProductRequestDto(Product product) {
        DeleteProductRequestDto deleteProductRequestDto = new DeleteProductRequestDto();
        deleteProductRequestDto.setProduct(ProductRequestDto.toProductRequestDto(product));
        return deleteProductRequestDto;
    }

    public Product toProduct() {
        return product.toProduct();
    }
}
