package com.gymmanager.ruby.model.customer;

import java.util.Collection;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.gymmanager.ruby.model.invoice.Invoice;
import com.gymmanager.ruby.model.invoice.PaymentSchedule;
import com.gymmanager.ruby.model.person.Person;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class GymClient extends Person{

    @OneToMany(mappedBy = "gymClient")
    private Collection<Invoice> invoices;

    @ManyToOne
    private PaymentSchedule paymentSchedule;

    private boolean enableRenewal;

}
