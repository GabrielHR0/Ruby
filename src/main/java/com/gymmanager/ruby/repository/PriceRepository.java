package com.gymmanager.ruby.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gymmanager.ruby.model.PriceTable.Price;

@Repository
public interface PriceRepository extends JpaRepository <Price, Long> {
    
}
