package com.gymmanager.ruby.model.PriceTable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Price {
    
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double discount;
    private Double subTotalPrice;


}
