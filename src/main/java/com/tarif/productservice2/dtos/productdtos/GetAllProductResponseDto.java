package com.tarif.productservice2.dtos.productdtos;

import lombok.Data;

import java.util.List;

@Data
public class GetAllProductResponseDto {
    private List<ProductResponseDto> products;
}
