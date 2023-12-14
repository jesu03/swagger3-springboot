package com.techieey.codefun.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techieey.codefun.model.Hotel;

public interface HotelRepository extends JpaRepository<Hotel,Integer>{
    
}
