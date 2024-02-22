package com.dev.rayan.springsecurity.domain.product;

import com.dev.rayan.springsecurity.domain.product.Product;

import java.util.UUID;

public record ProductResponseDTO(UUID productId, String title, Double price) {

    public ProductResponseDTO(Product product) {
        this(product.getProductId(), product.getTitle(), product.getPrice());
    }
}
