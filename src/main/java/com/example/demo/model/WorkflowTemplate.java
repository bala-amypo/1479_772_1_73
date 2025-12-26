package com.example.demo.model;

import javax.persistence.*;

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
