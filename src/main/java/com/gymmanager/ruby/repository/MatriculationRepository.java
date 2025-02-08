package com.gymmanager.ruby.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gymmanager.ruby.model.matriculation.Matriculation;

@Repository
public interface MatriculationRepository extends JpaRepository<Matriculation, Long> {
    
}
