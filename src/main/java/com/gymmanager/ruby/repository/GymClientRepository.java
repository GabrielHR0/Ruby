package com.gymmanager.ruby.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.gymmanager.ruby.model.customer.GymClient;

@Repository
public interface GymClientRepository extends JpaRepository<GymClient, Long> {
    
    boolean existsByRegistration(Long registration);

}
