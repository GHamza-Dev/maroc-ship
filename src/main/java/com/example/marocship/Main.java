package com.example.marocship;
import com.example.marocship.entities.Delivery;
import com.example.marocship.entities.DeliveryManager;
import jakarta.persistence.*;


public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
    }
}
