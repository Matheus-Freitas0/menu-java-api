package com.matheus.training_spring_boot.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;


@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    @Size(min = 2, max = 100, message = "O nome deve ter entre 2 e 100 caracteres")
    private String name;

    @Column(nullable = false, unique = true)
    @Email(message = "Email deve ser valido")
    @NotNull(message = "Email não pode ser nulo")
    private String email;
}
