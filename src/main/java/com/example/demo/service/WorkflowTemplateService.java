package com.example.demo.service;

import com.example.demo.model.WorkflowTemplate;
import com.example.demo.repository.WorkflowTemplateRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class WorkflowTemplateService {

    private final WorkflowTemplateRepository repo;

    public WorkflowTemplateService(WorkflowTemplateRepository repo) {
        this.repo = repo;
    }

    public WorkflowTemplate save(WorkflowTemplate t) {
        return repo.save(t);
    }

    public List<WorkflowTemplate> getAll() {
        return repo.findAll();
    }
}
