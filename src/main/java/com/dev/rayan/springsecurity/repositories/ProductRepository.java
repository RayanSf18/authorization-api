package com.dev.rayan.springsecurity.repositories;

import com.dev.rayan.springsecurity.domain.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProductRepository extends JpaRepository<Product, UUID> {

}