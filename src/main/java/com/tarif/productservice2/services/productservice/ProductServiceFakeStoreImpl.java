package com.tarif.productservice2.services.productservice;

import com.tarif.productservice2.dtos.fakestoredtos.*;
import com.tarif.productservice2.models.Product;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

@Service
@Primary
public class ProductServiceFakeStoreImpl implements ProductService {

    private final RestTemplate restTemplate;
    public ProductServiceFakeStoreImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
    @Override
    public Product createProduct(Product product) {
        FakeStoreCreateProductRequest fakeStoreCreateProductRequest = FakeStoreCreateProductRequest.fromProduct(product);

        FakeSToreCreateProductResponseDto responseDto = restTemplate.postForObject("https://fakestoreapi.com/products", fakeStoreCreateProductRequest, FakeSToreCreateProductResponseDto.class);

        return responseDto.toProduct();
    }

    @Override
    public List<Product> getAllProducts() {
        FakeStoreGetProductRequestDto[] res = restTemplate.getForObject("https://fakestoreapi.com/products", FakeStoreGetProductRequestDto[].class);
        List<FakeStoreGetProductRequestDto> resToList = Stream.of(res).toList();
        List<Product> products = new ArrayList<>();
        for(FakeStoreGetProductRequestDto fakeStoreGetProductDto : resToList) {
            products.add(fakeStoreGetProductDto.toProduct());
        }
        return products;
    }

    @Override
    public Product getProductById(Long id) {
        FakeStoreResponseDto response = restTemplate.getForObject("https://fakestoreapi.com/products/" + id, FakeStoreResponseDto.class);
        return response.toProduct();
    }

    @Override
    public Product updateProduct(Long id, Product product) {
        return null;
    }

    @Override
    public void deleteProduct(Long id) {
        restTemplate.delete("https://fakestoreapi.com/products/" + id);
        return;
    }
}
