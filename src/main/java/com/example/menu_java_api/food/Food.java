package com.example.menu_java_api.food;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "foods")
public class Food {
    private Long id;
    private String name;

}
