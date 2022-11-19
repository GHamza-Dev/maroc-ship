package com.example.marocship;
import com.example.marocship.entities.Delivery;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        Delivery delivery = new Delivery();
        delivery.setOrigin("Safi");
        delivery.setDestination("Korea");

        try{
            et.begin();
            em.persist(delivery);
            et.commit();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
