package com.gymmanager.ruby.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gymmanager.ruby.model.customer.GymClient;
import com.gymmanager.ruby.model.invoice.PaymentSchedule;
import com.gymmanager.ruby.repository.PaymentScheduleRepository;

@Service
public class PaymentScheduleService {

    @Autowired
    private PaymentScheduleRepository paymentScheduleRepository;

    private static final int DAYS_BEFORE_CLOSURE = 5; // Diferença entre vencimento e fechamento
    private static final int MAX_DAYS_AHEAD = 15;    // Limite de dias para a data de vencimento

    public void create(int dueDay, GymClient gymClient) throws Exception {
        LocalDate today = LocalDate.now();
        LocalDate dueDate = LocalDate.of(today.getYear(), today.getMonth(), dueDay);

        validateDueDate(dueDate);

        int closeDay = calculateCloseDay(dueDate);

        PaymentSchedule paymentDay = new PaymentSchedule();
        paymentDay.setDueDay(dueDay);

        paymentDay.getClients().add(gymClient);

        paymentScheduleRepository.save(paymentDay);
    }

    private int calculateCloseDay(LocalDate dueDate) {

        LocalDate closeDate = dueDate.minusDays(DAYS_BEFORE_CLOSURE);
        return closeDate.getDayOfMonth();

    }

    private void validateDueDate(LocalDate dueDate) throws Exception {
        if (dueDate == null) {
            throw new Exception("A data de vencimento não pode ser nula!");
        }

        LocalDate today = LocalDate.now();

        if (dueDate.isBefore(today)) {
            throw new Exception("A data de vencimento não pode ser anterior à data atual!");
        }

        if (dueDate.isAfter(today.plusDays(MAX_DAYS_AHEAD))) {
            throw new Exception("A data de vencimento não pode exceder " + MAX_DAYS_AHEAD + " dias a partir da data atual!");
        }
    }
}
