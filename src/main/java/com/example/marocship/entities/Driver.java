package com.example.marocship.entities;

import jakarta.persistence.Entity;

@Entity
public class Driver extends Person{

    private long vehicleId;

    public Driver() {}

    public Driver(long personId, String email, String username, String password) {
        super(personId, email, username, password);
    }

}
