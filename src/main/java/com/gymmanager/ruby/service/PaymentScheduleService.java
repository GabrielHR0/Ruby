package com.gymmanager.ruby.service;

import java.time.LocalDate;
import java.time.Month;
import java.time.Year;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gymmanager.ruby.model.customer.GymClient;
import com.gymmanager.ruby.model.invoice.PaymentSchedule;
import com.gymmanager.ruby.repository.PaymentScheduleRepository;

@Service
public class PaymentScheduleService {

    @Autowired
    private PaymentScheduleRepository paymentScheduleRepository;

    private LocalDate nowDate = LocalDate.now();
    private Month nowMonth = nowDate.getMonth();

    public void validadeDueDay(PaymentSchedule paymentSchedule) {
        try {
            LocalDate DueDate = dayToDate(paymentSchedule);
            if (DueDate.isBefore(nowDate)) {
                throw new RuntimeException("A data de vencimento não pode ser anterior à data atual")
            }
        } catch (Exception e){
            throw new RuntimeException("Erro ao criar data de vencimento: ", e);
        }
        
    }

    public LocalDate dayToDate(PaymentSchedule paymentSchedule) {
        try {
            LocalDate DueDate = LocalDate.of(paymentSchedule.getDueDay(), nowMonth.getValue(), nowDate.getYear());
            return DueDate;
        } catch (Exception e) {
            throw new RuntimeException("Erro ao definir data de vencimento: ", e);
        }
    }
}
