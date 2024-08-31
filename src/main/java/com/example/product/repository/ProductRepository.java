package com.example.product.repository;

import com.example.product.dto.*;

import java.util.*;

public interface ProductRepository {
    Product add(Product product);
    Product findById(Long id);
    List<Product> findAll();
    List<Product> findByNameContaining(String name);
    Product update(Product product);
    void delete(Long id);
}
