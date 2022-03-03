package com.piuralsight.hibernatfundamentals;

import com.piuralsight.hibernatfundamentals.airport.OneWayTicket;
import com.piuralsight.hibernatfundamentals.airport.Passenger;
import com.piuralsight.hibernatfundamentals.airport.ReturnTicket;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernatefundamentals.m08.ex01");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        Passenger john = new Passenger("John Smith");
        Passenger mike = new Passenger("Michael Johnson");

        OneWayTicket oneWayTicket = new OneWayTicket();
        oneWayTicket.setNumber("DD7894");
        oneWayTicket.setLastDepartureDate(LocalDate.of(2022,3,8));
        oneWayTicket.setPassenger(john);
        oneWayTicket.setPassenger(mike);

        ReturnTicket returnTicket = new ReturnTicket();
        returnTicket.setNumber("GG7456");
        returnTicket.setLatesReturnDate(LocalDate.of(2022,4,28));
        returnTicket.setPassenger(mike);
        returnTicket.setPassenger(john);

        em.persist(mike);
        em.persist(john);
        em.persist(oneWayTicket);
        em.persist(returnTicket);

        em.getTransaction().commit();
        emf.close();

    }
}
