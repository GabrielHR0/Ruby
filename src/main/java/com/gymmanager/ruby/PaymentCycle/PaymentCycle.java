package com.gymmanager.ruby.PaymentCycle;

import java.time.LocalDate;
import java.util.Collection;

import org.springframework.stereotype.Component;

import com.gymmanager.ruby.model.invoice.PaymentSchedule;

@Component
public class PaymentCycle {
    
    LocalDate LocaldateNow = LocalDate.now();

    Collection<PaymentSchedule> allPaymentSchedules;

}
