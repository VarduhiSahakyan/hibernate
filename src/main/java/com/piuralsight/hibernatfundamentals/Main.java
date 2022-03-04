package com.piuralsight.hibernatfundamentals;

import com.piuralsight.hibernatfundamentals.airport.OneWayTicket;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernatefundamentals.m01.ex08");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();



        OneWayTicket oneWayTicket = new OneWayTicket();
        oneWayTicket.setNumber("DD7894");
        oneWayTicket.setLastDepartureDate(LocalDate.of(2022,3,8));




        em.persist(oneWayTicket);
       

        em.getTransaction().commit();
        emf.close();

    }
}
