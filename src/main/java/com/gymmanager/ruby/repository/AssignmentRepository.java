package com.gymmanager.ruby.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gymmanager.ruby.model.assignment.Assignment;

@Repository
public interface AssignmentRepository extends JpaRepository<Assignment, Long>{
    
}
