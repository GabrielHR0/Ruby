package com.gymmanager.ruby.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gymmanager.ruby.model.matriculation.Matriculation;
import com.gymmanager.ruby.service.MatriculationService;

@RestController
@RequestMapping("/api/matriculation")
public class MatriculationController {

    @Autowired
    MatriculationService matriculationService;

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody Matriculation matriculation){

        try {
            matriculationService.create(matriculation);
            return new ResponseEntity<>(matriculation, HttpStatus.CREATED);
        } catch (Exception e) {
            throw new RuntimeException("Erro ao criar matrícula: ", e);
        }

    }
    
}