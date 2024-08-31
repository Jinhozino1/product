package com.example.product.service;

import jakarta.validation.*;
import org.springframework.stereotype.*;
import org.springframework.validation.annotation.*;

@Service
@Validated
public class ValidationService {
    public <T> void checkValid(@Valid T validationTarget) {

    }
}
