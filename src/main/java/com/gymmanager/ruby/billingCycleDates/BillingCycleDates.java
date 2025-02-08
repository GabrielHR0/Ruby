package com.gymmanager.ruby.billingCycleDates;

import java.util.Collection;

import org.springframework.stereotype.Component;

import com.gymmanager.ruby.model.invoice.PaymentSchedule;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Component
@Data
public class BillingCycleDates {
    

    private Collection<PaymentSchedule> DueDays;

}
