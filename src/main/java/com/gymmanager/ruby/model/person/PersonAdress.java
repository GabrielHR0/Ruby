package com.gymmanager.ruby.model.person;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class PersonAdress {

    private String street;      
    private String number;      
    private String complement;
    private String neighborhood;
    private String city;        
    private String state;       
    private String zipCode;     
    private String country;

}


