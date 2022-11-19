package com.example.marocship.entities;

import jakarta.persistence.*;

@Entity
public class DeliveryManager extends Person{

    public DeliveryManager() {}

    public DeliveryManager(long personId, String email, String username, String password) {
        super(personId, email, username, password);
    }

}
