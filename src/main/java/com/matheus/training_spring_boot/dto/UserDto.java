package com.matheus.training_spring_boot.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class UserDto {

    @Size(min = 2, max = 100, message = "O nome deve ter entre 2 e 100 caracteres")
    private String name;

    @Email(message = "Email deve ser valido")
    @NotNull(message = "Email não pode ser nulo")
    private String email;
}
