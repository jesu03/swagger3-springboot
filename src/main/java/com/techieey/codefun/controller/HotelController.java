package com.techieey.codefun.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techieey.codefun.model.Hotel;
import com.techieey.codefun.service.HotelService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/api/hotels")
public class HotelController{
        @Autowired
        private HotelService hotelService;
        
        @GetMapping(value="/")
        public List<Hotel> getAll(){
            return hotelService.findAll();
        }

        @PostMapping(value="/posts")
        public List<Hotel> persist(@RequestBody Hotel hotel){
            hotelService.save(hotel);
            return hotelService.findAll();          
        }

}
