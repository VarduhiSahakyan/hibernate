package com.piuralsight.hibernatfundamentals;

import com.piuralsight.hibernatfundamentals.airport.Passenger;
import com.piuralsight.hibernatfundamentals.airport.Ticket;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernatefundamentals.m05.ex01");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        Passenger john = new Passenger("John Smith");
        Passenger mike = new Passenger("Michael Johnson");

        Ticket ticket1 = new Ticket("AA1234");
        Ticket ticket2 = new Ticket("BB5678");
        Ticket ticket3 = new Ticket("CC0987");



        john.addTicket(ticket1);
        john.addTicket(ticket2);
        john.addTicket(ticket3);
        mike.addTicket(ticket1);
        mike.addTicket(ticket2);
        mike.addTicket(ticket3);


        ticket1.addPassenger(john);
        ticket2.addPassenger(john);
        ticket3.addPassenger(john);
        ticket1.addPassenger(mike);
        ticket2.addPassenger(mike);
        ticket3.addPassenger(mike);


// persist(save) all created objects ane by one meaning that we insert into the db
        // a corresponding record with their information
        em.persist(mike);
        em.persist(john);
        em.persist(ticket1);
        em.persist(ticket2);
        em.persist(ticket3);


        em.getTransaction().commit();
        emf.close();

    }
}
