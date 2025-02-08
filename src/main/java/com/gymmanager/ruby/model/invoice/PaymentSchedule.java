package com.gymmanager.ruby.model.invoice;

import java.util.Collection;

import com.gymmanager.ruby.model.customer.GymClient;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class PaymentSchedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private Integer dueDay;
    private Integer issueDay;

    @OneToOne
    private GymClient gymClient;
}
