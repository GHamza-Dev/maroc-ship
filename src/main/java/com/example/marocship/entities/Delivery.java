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

    public Long getVehicleCatId() {
        return vehicleCatId;
    }

    public void setVehicleCatId(Long vehicleCatId) {
        this.vehicleCatId = vehicleCatId;
    }

    @Column(name = "vehicle_cat_id")
    private long vehicleCatId;
    @ManyToOne
    @JoinColumn(name = "vehicle_cat_id",insertable = false,updatable = false)
    VehicleCategory vehicleCategory;

    @Column(name = "driver_id")
    private long driverId;

    @ManyToOne
    @JoinColumn(name = "driver_id",insertable = false,updatable = false)
    private Driver driver;

    public VehicleCategory getVehicleCategory() {
        return vehicleCategory;
    }

    @Column(name = "delivery_manager_id")
    private long deliveryManagerId;

    @ManyToOne
    @JoinColumn(name = "delivery_manager_id",insertable = false,updatable = false)
    DeliveryManager deliveryManager;


    @Transient
    private float price;

    public DeliveryManager getDeliveryManager() {
        return deliveryManager;
    }

    public void setDeliveryManager(DeliveryManager deliveryManager) {
        this.deliveryManager = deliveryManager;
    }

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
