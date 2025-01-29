package com.gymmanager.ruby.model.PriceTable;

import java.util.Collection;

import org.springframework.stereotype.Component;

import com.gymmanager.ruby.model.SubscriptionPlan.SubscripitionPlan;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
public class Price {
    
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double discount;
    private Double subTotalPrice;


}
