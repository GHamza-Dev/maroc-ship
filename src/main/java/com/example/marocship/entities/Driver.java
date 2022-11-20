package com.example.marocship.entities;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
public class Driver extends Person{

    @Column(name = "vehicle_id")
    private long vehicleId;

    @OneToOne
    @JoinColumn(name = "vehicle_id",insertable = false,updatable = false)
    private Vehicle vehicle;

    @OneToMany(mappedBy = "driver")
    private Collection<Delivery> deliveries;


    public Driver() {}

    public Driver(long personId, String email, String username, String password) {
        super(personId, email, username, password);
    }

}
