package com.example.marocship.dao;

import com.example.marocship.entities.Delivery;
import com.example.marocship.helpers.JPA;
import jakarta.persistence.EntityManager;

import java.util.List;

public class DeliveryDao implements Dao<Delivery>{
    @Override
    public Delivery get(long id) {
        return JPA.entityManager().find(Delivery.class, id);
    }

    @Override
    public List<Delivery> getAll() {
        return JPA.entityManager().createQuery("from Delivery ", Delivery.class).getResultList();
    }

    @Override
    public void save(Delivery delivery) {
        JPA.wrap(entityManager -> entityManager.persist(delivery));
    }

    @Override
    public void update(Delivery delivery, String[] setters) {
//        for (int i = 0; i < setters.length; i++) {
//            setters[i].accept(Delivery);
//        }
//        JPA.wrap(entityManager -> entityManager.merge(Delivery));
    }

    @Override
    public void delete(Delivery delivery) {
        EntityManager em = JPA.entityManager();
        Delivery deliveryToRemove = em.merge(delivery);
        JPA.wrap(em,entityManager -> entityManager.remove(deliveryToRemove));
    }
}
