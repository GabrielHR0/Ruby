package com.gymmanager.ruby.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gymmanager.ruby.model.SubscriptionPlan.SubscripitionPlan;

@Repository
public interface SubscripitionPlanRepository extends JpaRepository<SubscripitionPlan, Long> {
    
}
