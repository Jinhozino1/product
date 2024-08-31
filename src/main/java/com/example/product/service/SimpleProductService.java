package com.example.product.service;

import com.example.product.dto.*;
import com.example.product.repository.*;
import lombok.*;
//import org.modelmapper.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import java.util.*;

@Service
public class SimpleProductService {
    private final ProductRepository productRepository;
    private final ValidationService validationService;

    @Autowired
    SimpleProductService(ProductRepository productRepository, ValidationService validationService
    ) {
        this.productRepository = productRepository;
        this.validationService = validationService;
    }

    public ProductDto add(ProductDto productDto) {
        Product product = ProductDto.toEntity(productDto);
        validationService.checkValid(product);

        Product savedProduct = productRepository.add(product);
        ProductDto savedProductDto = ProductDto.toDto(savedProduct);
        return savedProductDto;
    }

    public ProductDto findById(Long id) {
        Product product = productRepository.findById(id);
        ProductDto productDto = ProductDto.toDto(product);
        return productDto;
//        return new ProductDto();
    }


    public List<ProductDto> findAll() {
        List<Product> products = productRepository.findAll();
        List<ProductDto> productDtos = products.stream()
                .map(product -> ProductDto.toDto(product))
                .toList();
        return productDtos;
    }

    public List<ProductDto> findByNameContaining(String name) {
        List<Product> products = productRepository.findByNameContaining(name);
        List<ProductDto> productDtos = products.stream()
                .map(product -> ProductDto.toDto(product))
                .toList();
        return productDtos;
    }

    public ProductDto update(ProductDto productDto) {
        Product product = ProductDto.toEntity(productDto);
        Product updatedProduct = productRepository.update(product);
        ProductDto updatedProductDto = ProductDto.toDto(updatedProduct);
        return updatedProductDto;
    }

    public void delete(Long id) {
        productRepository.delete(id);
    }
}
