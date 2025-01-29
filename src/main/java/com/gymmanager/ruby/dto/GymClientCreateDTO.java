package com.gymmanager.ruby.dto;

import com.gymmanager.ruby.model.person.PersonAdress;

import lombok.Data;

@Data
public class GymClientCreateDTO {
    
    private String firstName;
    private String lastName;
    private PersonAdress adress;
    
}