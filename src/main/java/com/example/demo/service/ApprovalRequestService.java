package com.example.demo.service;

import com.example.demo.model.ApprovalRequest;
import com.example.demo.repository.ApprovalRequestRepository;
import org.springframework.stereotype.Service;

@Service
public class ApprovalRequestService {

    private final ApprovalRequestRepository repo;

    public ApprovalRequestService(ApprovalRequestRepository repo) {
        this.repo = repo;
    }

    public ApprovalRequest create(ApprovalRequest r) {
        return repo.save(r);
    }
}
