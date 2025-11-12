package dev.garcias.security.dto.request;

import jakarta.validation.constraints.NotEmpty;

public record RegisterUserRequest(@NotEmpty(message = "Name is required.") String name,
                                  @NotEmpty(message = "Email is required.") String email,
                                  @NotEmpty(message = "Password is required.") String Password) {
}
