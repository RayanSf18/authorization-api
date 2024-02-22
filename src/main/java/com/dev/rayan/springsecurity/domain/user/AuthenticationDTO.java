package com.dev.rayan.springsecurity.domain.user;

import jakarta.validation.constraints.NotBlank;

public record AuthenticationDTO(String login, String password) {

}
