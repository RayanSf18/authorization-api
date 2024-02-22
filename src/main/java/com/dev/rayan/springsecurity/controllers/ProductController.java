package com.dev.rayan.springsecurity.controllers;

import com.dev.rayan.springsecurity.domain.product.Product;
import com.dev.rayan.springsecurity.domain.product.ProductRequestDTO;
import com.dev.rayan.springsecurity.domain.product.ProductResponseDTO;
import com.dev.rayan.springsecurity.repositories.ProductRepository;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductRepository repository;

    public ProductController(ProductRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public ResponseEntity<ProductResponseDTO> postProduct(@Valid @RequestBody ProductRequestDTO productRequestDTO) {
        Product newProduct = new Product(productRequestDTO);

        this.repository.save(newProduct);
        return ResponseEntity.ok().body(new ProductResponseDTO(newProduct));
    }

    @GetMapping
    public ResponseEntity<List<ProductResponseDTO>> getAllProducts() {
        List<ProductResponseDTO> productResponseDTOList = this.repository.findAll().stream().map(ProductResponseDTO::new).toList();

        return ResponseEntity.ok().body(productResponseDTOList);
    }
}