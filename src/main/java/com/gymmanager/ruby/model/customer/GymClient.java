package com.gymmanager.ruby.model.customer;

import java.util.Collection;

import com.gymmanager.ruby.model.invoice.Invoice;
import com.gymmanager.ruby.model.invoice.PaymentSchedule;
import com.gymmanager.ruby.model.matriculation.Matriculation;
import com.gymmanager.ruby.model.person.Person;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class GymClient extends Person{

    @OneToMany()
    private Collection<Invoice> clientInvoices;

    @OneToMany @JoinColumn(name = "matriculation_ids")
    private Collection<Matriculation> clientMatriculations;

    @OneToOne @JoinColumn(name = "billing_cycle_day")
    PaymentSchedule paymentSchedule;

    private boolean enableRenewal;

}
