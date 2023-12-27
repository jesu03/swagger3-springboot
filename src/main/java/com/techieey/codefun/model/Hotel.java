package com.techieey.codefun.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Hotel {
    @Id
    private String hotelid;
    private String country;
    private String city;
    private Long phno;

    

    public Hotel() {
    }
    
    public Hotel(String hotelid, String country, String city, Long phno) {
        this.hotelid = hotelid;
        this.country = country;
        this.city = city;
        this.phno = phno;
    }
    public String getHotelid() {
        return hotelid;
    }
    public void setHotelid(String hotelid) {
        this.hotelid = hotelid;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public Long getPhno() {
        return phno;
    }
    public void setPhno(Long phno) {
        this.phno = phno;
    }

    
}
