package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class Role {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
}
