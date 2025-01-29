package com.gymmanager.ruby.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import com.gymmanager.ruby.dto.GymClientCreateDTO;
import com.gymmanager.ruby.model.customer.GymClient;
import com.gymmanager.ruby.service.GymClientService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController("/Client")
public class GymClientController {
    
    @Autowired
    GymClientService gymClientService;

    @PostMapping("/new")
    public ResponseEntity<GymClient> create(@RequestBody GymClientCreateDTO entity) {
        
        GymClient responseClient = gymClientService.save(entity);
        
        return ResponseEntity.ok(responseClient);
        
    }
    


}
