package com.gymmanager.ruby.model.matriculation;

import com.gymmanager.ruby.model.SubscriptionPlan.SubscripitionPlan;
import com.gymmanager.ruby.model.assignment.Assignment;
import com.gymmanager.ruby.model.customer.GymClient;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Matriculation {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne @JoinColumn(name = "client_id", referencedColumnName = "id") 
    private GymClient gymClient;

    @OneToOne @JoinColumn(name = "assignment_id", referencedColumnName = "id") 
    private Assignment assignment;

    @OneToOne @JoinColumn(name = "subscripitionPlan_id", referencedColumnName = "id")
    private SubscripitionPlan subscripitionPlan;

}
