package com.gymmanager.ruby.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gymmanager.ruby.model.assignment.Assignment;
import com.gymmanager.ruby.repository.AssignmentRepository;

@Service
public class AssignmentService {
    
    @Autowired
    AssignmentRepository assignmentRepository;

    public Assignment create(Assignment service){

        return assignmentRepository.save(service);

    }

}
