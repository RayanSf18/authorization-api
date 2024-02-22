package com.dev.rayan.springsecurity.domain.product;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ProductRequestDTO(@NotBlank String title, @NotNull Double price) {
}
