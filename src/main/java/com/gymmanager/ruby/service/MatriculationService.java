package com.gymmanager.ruby.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gymmanager.ruby.model.matriculation.Matriculation;
import com.gymmanager.ruby.repository.AssignmentRepository;
import com.gymmanager.ruby.repository.GymClientRepository;
import com.gymmanager.ruby.repository.MatriculationRepository;
import com.gymmanager.ruby.repository.SubscripitionPlanRepository;

@Service
public class MatriculationService {

    @Autowired
    MatriculationRepository matriculationRepository;

    @Autowired
    GymClientRepository gymClientRepository;

    @Autowired
    AssignmentRepository assignmentRepository;

    @Autowired
    SubscripitionPlanRepository subscripitionPlanRepository;

    public Matriculation create(Matriculation matriculation) {

        return matriculationRepository.save(matriculation);

    }

}
