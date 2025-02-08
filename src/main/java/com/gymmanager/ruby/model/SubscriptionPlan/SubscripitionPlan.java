package com.gymmanager.ruby.model.SubscriptionPlan;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class SubscripitionPlan {
    
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Integer planDuration;
    private Double discontPerMounth;

}
