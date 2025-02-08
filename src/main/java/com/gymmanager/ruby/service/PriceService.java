package com.gymmanager.ruby.service;

//import org.hibernate.engine.jdbc.env.internal.LobCreationLogging_.logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gymmanager.ruby.model.PriceTable.Price;
import com.gymmanager.ruby.repository.PriceRepository;

@Service
public class PriceService {

    @Autowired
    private PriceRepository priceRepository;

    public Price create(Price price){
        
        try {
            return priceRepository.save(price);

        } catch (Exception e) {
            //logger.error("Error occurred while saving price: ", e);
            throw new RuntimeException("Failed to save price", e);
        }

    }
}
