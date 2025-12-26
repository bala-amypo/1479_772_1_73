package com.example.demo.service;

import com.example.demo.model.WorkflowStepConfig;
import com.example.demo.repository.WorkflowStepConfigRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class WorkflowStepConfigService {

    private final WorkflowStepConfigRepository repo;

    public WorkflowStepConfigService(WorkflowStepConfigRepository repo) {
        this.repo = repo;
    }

    public WorkflowStepConfig save(WorkflowStepConfig c) {
        return repo.save(c);
    }

    public List<WorkflowStepConfig> findByTemplate(Long id) {
        return repo.findByTemplateIdOrderByLevelNumberAsc(id);
    }
}
