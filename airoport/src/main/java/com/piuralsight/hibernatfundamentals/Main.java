package com.piuralsight.hibernatfundamentals;

import com.piuralsight.hibernatfundamentals.airport.Airport;
import com.piuralsight.hibernatfundamentals.airport.Passenger;
import com.piuralsight.hibernatfundamentals.airport.Ticket;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernatefundamentals.m02.ex01");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        Airport airport = new Airport(1,"Henri Coanda");

        Passenger john = new Passenger(1,"John Smith");
        john.setAirport(airport);

        Passenger mike = new Passenger(2,"Michael Johnson");
        mike.setAirport(airport);
        airport.addPassenger(john);
        airport.addPassenger(mike);

        Ticket ticket1 = new Ticket(1,"AA1234");
        ticket1.setPassenger(john);

        Ticket ticket2 = new Ticket(2,"BB5678");
        ticket2.setPassenger(mike);

        john.addTicket(ticket1);
        john.addTicket(ticket2);

        Ticket ticket3 = new Ticket(3,"CC0987");
        ticket3.setPassenger(mike);

        mike.addTicket(ticket3);
// persist(save) all created objects ane by one meaning that we insert into the db
        // a corresponding record with their information
        em.persist(airport);
        em.persist(john);
        em.persist(mike);
        em.persist(ticket1);
        em.persist(ticket2);
        em.persist(ticket3);


        em.getTransaction().commit();
        emf.close();

    }
}
