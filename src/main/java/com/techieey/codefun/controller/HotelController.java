package com.techieey.codefun.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techieey.codefun.model.Hotel;
import com.techieey.codefun.repository.HotelRepository;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/api/hotels")
public class HotelController{

        @Autowired
        private HotelRepository hotelRepository;
        
        @GetMapping("/")
        public List<Hotel> getAll(){
            return hotelRepository.findAll();
        }

        @PostMapping("/post")
        public Hotel persist(@RequestBody Hotel hotel){
            hotelRepository.save(hotel);
            return hotelRepository.findById(hotel.getId()).get();          
        }


}
