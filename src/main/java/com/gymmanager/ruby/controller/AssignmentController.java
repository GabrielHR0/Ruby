package com.gymmanager.ruby.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.gymmanager.ruby.model.assignment.Assignment;
import com.gymmanager.ruby.service.AssignmentService;
import com.gymmanager.ruby.service.PriceService;

import org.springframework.web.bind.annotation.PostMapping;


@RestController()
@RequestMapping("/api/Assignment")
public class AssignmentController {
    
    @Autowired
    AssignmentService assignmentService;

    @Autowired
    PriceService priceService;

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody Assignment assignment){
        try {
            priceService.create(assignment.getPrice());
            assignmentService.create(assignment);
            return ResponseEntity.ok(assignment);
        } catch (Exception e){
            throw new RuntimeException("Erro ao criar um serviço: ", e);
        }

    }

}
