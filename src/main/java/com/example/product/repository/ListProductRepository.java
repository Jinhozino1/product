package com.example.product.repository;

import com.example.product.dto.*;
import com.example.product.presentation.*;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.*;

import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.*;

@Repository
@Profile("test")
public class ListProductRepository implements ProductRepository{
    private List<Product> products = new CopyOnWriteArrayList<>();
    private AtomicLong sequence = new AtomicLong(1L);

    public Product add(Product product) {
        product.setId(sequence.getAndAdd(1L));

        products.add(product);
        return product;
    }

    public Product findById(Long id) {
        return products.stream()
                .filter(product -> product.sameId(id))
                .findFirst()
                .orElseThrow(() -> new EntityNotFoundException("Product를 찾지 못했습니다."));
    }

    public List<Product> findAll() {
        return products;
    }

    public List<Product> findByNameContaining(String name) {
        return products.stream()
                .filter(product -> product.containsName(name))
                .toList();
    }

    public Product update(Product product) {
        Integer indexToModify = products.indexOf(product);
        products.set(indexToModify, product);
        return product;
    }

    public void delete(Long id) {
        Product product = this.findById(id);
        products.remove(product);
    }
}
