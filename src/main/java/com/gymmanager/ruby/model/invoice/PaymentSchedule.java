package com.gymmanager.ruby.model.invoice;

import java.time.LocalDate;
import java.util.Collection;

import com.gymmanager.ruby.model.customer.GymClient;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class PaymentSchedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private Integer dueDay;

    @OneToMany
    @JoinColumn(name = "clients_id")
    private Collection<GymClient> clients;

}
