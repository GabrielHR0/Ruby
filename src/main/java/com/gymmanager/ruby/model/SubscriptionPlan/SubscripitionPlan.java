package com.gymmanager.ruby.model.SubscriptionPlan;

import com.gymmanager.ruby.model.PriceTable.Price;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class SubscripitionPlan {
    
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String Name;
    private Integer PlanDuration;
    private Double discontPerMounth;

}
