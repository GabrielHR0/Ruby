package com.gymmanager.ruby.model.invoice;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.gymmanager.ruby.model.customer.GymClient;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Invoice {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private LocalDate dueDate;
    private LocalDate issueDay;
    private LocalDateTime paymentDate;

    private Long finalValue;
    

    @ManyToOne()
    @JoinColumn(name="client_id", nullable = false)
    private GymClient gymClient;
    

}
