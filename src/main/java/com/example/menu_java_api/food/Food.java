package com.example.menu_java_api.food;

import jakarta.persistence.*;

@Entity(name = "foods")
@Table(name = "foods")

public class Food {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String title;

    private String image;

    private Integer price;

}
