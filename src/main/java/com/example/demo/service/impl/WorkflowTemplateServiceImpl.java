package com.example.demo.service.impl;

import com.example.demo.model.WorkflowTemplate;
import com.example.demo.repository.WorkflowTemplateRepository;
import com.example.demo.service.WorkflowTemplateService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WorkflowTemplateServiceImpl implements WorkflowTemplateService {

    private final WorkflowTemplateRepository repository;

    public WorkflowTemplateServiceImpl(WorkflowTemplateRepository repository) {
        this.repository = repository;
    }

    @Override
    public WorkflowTemplate createTemplate(WorkflowTemplate template) {
        template.setActive(false);
        return repository.save(template);
    }

    @Override
    public WorkflowTemplate updateTemplate(Long id, WorkflowTemplate template) {
        WorkflowTemplate existing = repository.findById(id).orElseThrow();
        existing.setTemplateName(template.getTemplateName());
        existing.setDescription(template.getDescription());
        existing.setTotalLevels(template.getTotalLevels());
        return repository.save(existing);
    }

    @Override
    public WorkflowTemplate activateTemplate(Long id, boolean active) {
        WorkflowTemplate template = repository.findById(id).orElseThrow();
        template.setActive(active);
        return repository.save(template);
    }

    @Override
    public Optional<WorkflowTemplate> getTemplateById(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<WorkflowTemplate> getAllTemplates() {
        return repository.findAll();
    }
}
