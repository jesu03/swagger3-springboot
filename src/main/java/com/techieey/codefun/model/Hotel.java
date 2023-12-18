package com.techieey.codefun.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

@Entity
public class Hotel {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    @NotNull
    private String country;
    @NotNull
    private String city;
    @NotNull
    private long phnumber;
    public Hotel(Integer id, String country, String city, long phnumber) {
        this.id = id;
        this.country = country;
        this.city = city;
        this.phnumber = phnumber;
    }
    public Hotel() {
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
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
    public long getPhnumber() {
        return phnumber;
    }
    public void setPhnumber(long phnumber) {
        this.phnumber = phnumber;
    }
    
}
