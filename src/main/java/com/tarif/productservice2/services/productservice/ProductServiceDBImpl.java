package com.tarif.productservice2.services.productservice;

import com.tarif.productservice2.models.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceDBImpl implements ProductService {

    @Override
    public Product createProduct(Product product) {
        return product;
    }

    @Override
    public List<Product> getAllProducts() {
        return List.of();
    }

    @Override
    public Product getProductById(Long id) {
        return null;
    }

    @Override
    public Product updateProduct(Long id, Product product) {
        return null;
    }

    @Override
    public void deleteProduct(Long id) {
        return;
    }
}
