package com.example.marocship.entities;

import jakarta.persistence.*;

import java.sql.Timestamp;


@Entity
public class Delivery {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(length = 50,nullable = true)
    private float weight;

    @Column(name = "origin",length = 50,nullable = true)
    private String origin;

    @Column(name = "destination",length = 50,nullable = true)
    private String destination;

    @Column(name = "status",length = 50,nullable = true)
    private String status;

    @Column(name = "created_at")
    private Timestamp createdAt;

    @Column(name = "delivered_at")
    private Timestamp deliveredAt;

    @ManyToOne
    @JoinColumn(name = "vehicle_cat_id")
    VehicleCategory vehicleCategory;

    @Transient
    private float price;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }



    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getDeliveredAt() {
        return deliveredAt;
    }

    public void setDeliveredAt(Timestamp deliveredAt) {
        this.deliveredAt = deliveredAt;
    }
}
