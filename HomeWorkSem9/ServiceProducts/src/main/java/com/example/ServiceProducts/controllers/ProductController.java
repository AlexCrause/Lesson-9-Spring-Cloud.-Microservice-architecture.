package com.example.ServiceProducts.controllers;

import com.example.ServiceProducts.models.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @GetMapping
    public ResponseEntity<List<Product>> listProducts() {
        List<Product> products = List.of(
                new Product(1L, "Laptop", "High-end laptop", 1000.0),
                new Product(2L, "Smartphone", "Latest model", 800.0)
        );
        return ResponseEntity.ok(products);
    }

    @PostMapping
    public ResponseEntity<Product> addProduct(@RequestBody Product product) {
        // Adding product logic here
        return ResponseEntity.ok(product);
    }
}
