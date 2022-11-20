package com.example.marocship.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Driver extends Person{

    @Column(name = "vehicle_id", nullable = false)
    private long vehicleId;

    @ManyToOne
    @JoinColumn(name = "vehicle_id", referencedColumnName = "id", insertable=false, updatable=false)
    private Vehicle vehicleByVehicleId;

    public Driver() {}

    public Driver(long personId, String email, String username, String password, long vehcileId) {
        super(personId, email, username, password);
        this.vehicleId = vehcileId;
    }

    public long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(long vehicleId) {
        this.vehicleId = vehicleId;
    }

    public Vehicle getVehicleByVehicleId() {
        return vehicleByVehicleId;
    }

    public void setVehicleByVehicleId(Vehicle vehicleByVehicleId) {
        this.vehicleByVehicleId = vehicleByVehicleId;
    }
}
