package com.example.demo.service;

import com.example.demo.model.ApprovalAction;
import com.example.demo.repository.ApprovalActionRepository;
import org.springframework.stereotype.Service;

@Service
public class ApprovalActionService {

    private final ApprovalActionRepository repo;

    public ApprovalActionService(ApprovalActionRepository repo) {
        this.repo = repo;
    }

    public ApprovalAction save(ApprovalAction a) {
        return repo.save(a);
    }
}
