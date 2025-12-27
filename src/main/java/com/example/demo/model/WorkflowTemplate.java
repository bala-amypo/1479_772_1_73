package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class WorkflowTemplate {

    @Id
    @GeneratedValue
    private Long id;

    @Column(unique = true)
    private String templateName;

    private String description;
    private Integer totalLevels;
    private Boolean active;
}
