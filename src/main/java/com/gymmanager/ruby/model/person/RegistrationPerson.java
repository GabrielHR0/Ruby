package com.gymmanager.ruby.model.person;

import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Component;

import com.gymmanager.ruby.RubyApplication;

@Component
public class RegistrationPerson {
    
    Long timestamp = System.currentTimeMillis();

    public Long gerarMatricula(){
        return this.timestamp % 1000000;
    }

}

