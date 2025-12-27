package com.example.demo.service.impl;

import com.example.demo.model.AuditLogRecord;
import com.example.demo.repository.AuditLogRecordRepository;
import com.example.demo.service.AuditLogService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class AuditLogServiceImpl implements AuditLogService {

    private final AuditLogRecordRepository repository;

    public AuditLogServiceImpl(AuditLogRecordRepository repository) {
        this.repository = repository;
    }

    @Override
    public AuditLogRecord logEvent(Long requestId, String eventType, String details) {
        AuditLogRecord record = new AuditLogRecord();
        record.setRequestId(requestId);
        record.setEventType(eventType);
        record.setDetails(details);
        record.setLoggedAt(LocalDateTime.now());
        return repository.save(record);
    }
}
