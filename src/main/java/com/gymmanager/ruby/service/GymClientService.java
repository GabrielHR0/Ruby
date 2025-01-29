package com.gymmanager.ruby.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gymmanager.ruby.dto.GymClientCreateDTO;
import com.gymmanager.ruby.model.customer.GymClient;
import com.gymmanager.ruby.model.person.RegistrationPerson;
import com.gymmanager.ruby.repository.GymClientRepository;

@Service
public class GymClientService {
    
    @Autowired
    GymClientRepository ClientRepository;

    @Autowired
    RegistrationPerson registration;

    public GymClient save(GymClientCreateDTO clientDTO){
        Long generateRegistration = registration.gerarMatricula();

        while (ClientRepository.existsByRegistration(generateRegistration)){
            generateRegistration = registration.gerarMatricula();
        }

        GymClient client = new GymClient();

        client.setFirstName(clientDTO.getFirstName());
        client.setLastName(clientDTO.getLastName());
        client.setAddress(clientDTO.getAdress());

        client.setRegistration(registration.gerarMatricula());
        return ClientRepository.save(client);
    }

}
