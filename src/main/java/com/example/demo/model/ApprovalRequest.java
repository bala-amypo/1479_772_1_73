package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class ApprovalRequest {

    @Id
    @GeneratedValue
    private Long id;

    private Long templateId;
    private Long requesterId;
    private String requestTitle;

    @Lob
    private String requestPayloadJson;

    private String status = "PENDING";
    private Integer currentLevel;
    private LocalDateTime createdAt = LocalDateTime.now();
}
