package com.example.marocship;
import com.example.marocship.entities.Delivery;
import com.example.marocship.entities.DeliveryManager;
import jakarta.persistence.*;


public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

//        Delivery delivery = new Delivery();
//        delivery.setOrigin("Safi");
//        delivery.setDestination("Korea");
//
//        delivery.setVehicleCatId(1L);
//
//        DeliveryManager deliveryManager = new DeliveryManager();
//        deliveryManager.setPersonId(1);
//
//        delivery.setDeliveryManager(deliveryManager);

//        public List<DepartementManager> getAll() {
//            Query query = JPA.entityManager().createQuery("SELECT c FROM DepartementManager c");
//            return query.getResultList();
//        }

//        try{
//            et.begin();
//            Query q = em.createQuery("SELECT d FROM Delivery d");
//            System.out.println(((Delivery)q.getResultList().get(3)).getVehicleCategory().getType());
////            em.persist(delivery);
//            et.commit();
//        }catch (Exception e){
//            e.printStackTrace();
//        }
    }
}
