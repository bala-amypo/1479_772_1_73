package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class AuditLogRecord {

    @Id
    @GeneratedValue
    private Long id;

    private Long requestId;
    private String eventType;
    private String details;
    private LocalDateTime loggedAt = LocalDateTime.now();
}
