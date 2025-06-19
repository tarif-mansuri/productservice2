package com.tarif.productservice2.services.productservice;

import com.tarif.productservice2.models.Product;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceDBImpl implements ProductService {

    @Override
    public Product createProduct(Product product) {
        return product;
    }
}
