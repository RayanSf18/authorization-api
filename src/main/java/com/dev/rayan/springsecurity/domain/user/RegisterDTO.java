package com.dev.rayan.springsecurity.domain.user;

import jakarta.validation.constraints.NotBlank;

public record RegisterDTO(String login, String password, UserRole role) {
}
