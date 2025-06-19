package com.tarif.productservice2.services.productservice;

import com.tarif.productservice2.dtos.products.FakeSToreCreateProductResponseDto;
import com.tarif.productservice2.dtos.products.FakeStoreCreateProductRequest;
import com.tarif.productservice2.models.Product;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Primary
public class ProductServiceFakeStoreImpl implements ProductService {

    private RestTemplate restTemplate;
    public ProductServiceFakeStoreImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
    @Override
    public Product createProduct(Product product) {
        FakeStoreCreateProductRequest fakeStoreCreateProductRequest = new FakeStoreCreateProductRequest();
        fakeStoreCreateProductRequest.setTitle(product.getTitle());
        fakeStoreCreateProductRequest.setDescription(product.getDescription());
        fakeStoreCreateProductRequest.setPrice(product.getPrice());
        fakeStoreCreateProductRequest.setCategory(product.getCategoryName());
        fakeStoreCreateProductRequest.setImage(product.getImageUrl());
        FakeSToreCreateProductResponseDto responseDto = restTemplate.postForObject("https://fakestoreapi.com/products", fakeStoreCreateProductRequest, FakeSToreCreateProductResponseDto.class);

        Product product1 = new Product();
        product1.setTitle(responseDto.getTitle());
        product1.setDescription(responseDto.getDescription());
        product1.setPrice(responseDto.getPrice());
        product1.setCategoryName(responseDto.getCategory());
        product1.setId(responseDto.getId());
        product1.setImageUrl(responseDto.getImage());
        return product1;
    }
}
