package com.tarif.productservice2.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Category extends BaseModel {
    private String name;
    private String description;
    @OneToMany
    private List<Product> featuredProducts;
    @OneToMany(mappedBy = "category")
    private List<Product> allProducts;
}
