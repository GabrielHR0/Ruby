package com.gymmanager.ruby.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gymmanager.ruby.model.SubscriptionPlan.SubscripitionPlan;
import com.gymmanager.ruby.repository.SubscripitionPlanRepository;

@Service
public class SubscripitionPlanService {
    
    @Autowired
    SubscripitionPlanRepository subscripitionPlanRepository;

    public SubscripitionPlan create(SubscripitionPlan subscripitionPlan){

        return subscripitionPlanRepository.save(subscripitionPlan);
        
    }

}
