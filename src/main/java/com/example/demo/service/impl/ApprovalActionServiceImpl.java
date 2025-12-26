package com.example.demo.service.impl;

import com.example.demo.model.ApprovalAction;
import com.example.demo.model.ApprovalRequest;
import com.example.demo.repository.ApprovalActionRepository;
import com.example.demo.repository.ApprovalRequestRepository;
import com.example.demo.service.ApprovalActionService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class ApprovalActionServiceImpl implements ApprovalActionService {

    private final ApprovalActionRepository actionRepository;
    private final ApprovalRequestRepository requestRepository;

    public ApprovalActionServiceImpl(
            ApprovalActionRepository actionRepository,
            ApprovalRequestRepository requestRepository
    ) {
        this.actionRepository = actionRepository;
        this.requestRepository = requestRepository;
    }

    @Override
    public ApprovalAction recordAction(ApprovalAction action) {
        action.setActionDate(LocalDateTime.now());

        ApprovalRequest request = requestRepository.findById(action.getRequestId()).orElseThrow();

        if ("APPROVED".equalsIgnoreCase(action.getAction())) {
            request.setCurrentLevel(request.getCurrentLevel() + 1);
        } else {
            request.setStatus("REJECTED");
        }

        requestRepository.save(request);
        return actionRepository.save(action);
    }
}
