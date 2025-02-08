package com.gymmanager.ruby.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gymmanager.ruby.model.SubscriptionPlan.SubscripitionPlan;
import com.gymmanager.ruby.service.SubscripitionPlanService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController()
@RequestMapping("/api/Plan")
public class SubscripitionPlanController {

    @Autowired
    SubscripitionPlanService subscripitionPlanService; 

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody SubscripitionPlan subscripitionPlan){

        try{
        subscripitionPlanService.create(subscripitionPlan);
        return new ResponseEntity<>(subscripitionPlan, HttpStatus.CREATED);
        
        } catch (Exception e){
            throw new RuntimeException("Erro ao criar um Plano: ", e);
        }
    }

    @GetMapping("findById/{}")
    public String getMethodName(@PathVariable Long id) {
        return new String();
    }
    
    
}
