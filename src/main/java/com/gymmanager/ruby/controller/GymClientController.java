package com.gymmanager.ruby.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.gymmanager.ruby.dto.GymClientCreateDTO;
import com.gymmanager.ruby.model.customer.GymClient;
import com.gymmanager.ruby.service.GymClientService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController()
@RequestMapping("api/client")
public class GymClientController {
    
    @Autowired
    GymClientService gymClientService;

    @PostMapping("/create")
    public ResponseEntity<GymClient> create(@RequestBody GymClientCreateDTO entity) {
        
        GymClient responseClient = gymClientService.save(entity);
        
        return ResponseEntity.ok(responseClient);
        
    }
    


}
