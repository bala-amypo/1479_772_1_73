package com.example.demo.model;

import javax.persistence.*;

@Entity
public class Role {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
}
