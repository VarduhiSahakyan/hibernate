package com.piuralsight.hibernatfundamentals;


import com.piuralsight.hibernatfundamentals.airport.Passenger;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernatefundamentals.m01.ex09");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        Passenger josh = new Passenger("Josh Smith");
        josh.setVip(true);

        Passenger mike = new Passenger("Michael Johonson");
        mike.setVip(false);

        em.persist(josh);
        em.persist(mike);

        em.getTransaction().commit();
        em.close();
        emf.close();

    }
}
