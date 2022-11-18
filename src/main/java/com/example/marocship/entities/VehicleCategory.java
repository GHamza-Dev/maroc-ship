package com.example.marocship.entities;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
@Table(name = "vehicle_category")
public class VehicleCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToMany(mappedBy = "vehicleCategory")
    private Collection<Vehicle> vehicles;

    @OneToMany(mappedBy = "vehicleCategory")
    private Collection<Delivery> deliveries;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(length = 50)
    private String type;

}
