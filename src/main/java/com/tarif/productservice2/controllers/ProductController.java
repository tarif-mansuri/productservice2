package com.tarif.productservice2.controllers;

import com.tarif.productservice2.dtos.productdtos.*;
import com.tarif.productservice2.models.Product;
import com.tarif.productservice2.services.productservice.ProductService;
import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    @PostMapping("/products")
    public CreateProductResponseDto createProducts(@RequestBody CreateProductRequestDto createProductRequestDto) {
        Product product = productService.createProduct(createProductRequestDto.toProduct());
        CreateProductResponseDto res = CreateProductResponseDto.fromProduct(product);
        return res;
    }

    @GetMapping("/products")
    public GetAllProductResponseDto getAllProducts() {
        List<Product> products = productService.getAllProducts();
        List<ProductResponseDto> productResponseDtos = new ArrayList<>();
        for (Product product : products) {
            ProductResponseDto response = ProductResponseDto.toProductResponseDto(product);
            productResponseDtos.add(response);
        }
        GetAllProductResponseDto res = new GetAllProductResponseDto();
        res.setProducts(productResponseDtos);
        return res;
    }

    @GetMapping("/products/{id}")
    public GetProductResponseDto getSingleProduct(@PathVariable("id") Long productId) {
        Product product = productService.getProductById(productId);
        return GetProductResponseDto.toGetProductResponseDto(product);
    }

    @DeleteMapping("/products/{id}")
    public boolean deleteProduct(@PathVariable("id") Long productId) {
        productService.deleteProduct(productId);
        return true;
    }

    @RequestMapping(name ="TARIF", value = "/tarifrequest")
    public String TarifRequest(){
        return "Tarif custom method";
    }
}
/*
  Passing data to server --> 2 ways
  1. Passing in url
   http://localhost:8080/users/{id} --> id is called path variable
   http://localhost:8080/users?id=10&name=tarif --> id and name are called query parameters

  2. Passing in Request body
    http://localhost:8080/users
    request body --> {JSON/XML/Files/Txt/anything}
 */
