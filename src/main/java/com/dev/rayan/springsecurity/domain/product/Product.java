package com.dev.rayan.springsecurity.domain.product;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "productId")
@Entity
@Table(name = "TB_PRODUCTS")
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID productId;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private Double price;

    public Product(ProductRequestDTO data) {
        this.title = data.title();
        this.price = data.price();
    }
}
