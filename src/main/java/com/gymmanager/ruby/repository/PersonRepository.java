package com.gymmanager.ruby.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gymmanager.ruby.model.person.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{
    
}
