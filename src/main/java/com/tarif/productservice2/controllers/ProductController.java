package com.tarif.productservice2.controllers;

import com.tarif.productservice2.dtos.products.CreateProductRequestDto;
import com.tarif.productservice2.dtos.products.CreateProductResponseDto;
import com.tarif.productservice2.models.Product;
import com.tarif.productservice2.services.productservice.ProductService;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public void getAllProducts() {

    }

    @GetMapping("/products/{id}")
    public void getSingleProduct(@PathVariable("id") Long productId) {

    }

    @DeleteMapping("/products/{id}")
    public void deleteProduct() {

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
