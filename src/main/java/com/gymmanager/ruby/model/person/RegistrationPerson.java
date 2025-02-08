package com.gymmanager.ruby.model.person;

import org.springframework.stereotype.Component;

@Component
public class RegistrationPerson {
    
    Long timestamp = System.currentTimeMillis();

    public Long gerarMatricula(){
        return this.timestamp % 1000000;
    }

}

