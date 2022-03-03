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
        Ticket ticket1 = new Ticket("AA1234");
        ticket1.setPassenger(john);

        Passenger mike = new Passenger("Michael Johnson");
        Ticket ticket2 = new Ticket("BB5678");
        ticket2.setPassenger(john);

        john.addTicket(ticket1);
        john.addTicket(ticket2);

        Ticket ticket3 = new Ticket("CC0987");
        ticket3.setPassenger(mike);

        john.addTicket(ticket3);
// persist(save) all created objects ane by one meaning that we insert into the db
        // a corresponding record with their information
        em.persist(mike);
        em.persist(ticket3);
        em.persist(john);
        em.persist(ticket1);
        em.persist(ticket2);



        em.getTransaction().commit();
        emf.close();

    }
}
