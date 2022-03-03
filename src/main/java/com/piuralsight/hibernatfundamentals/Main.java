package com.piuralsight.hibernatfundamentals;

import com.piuralsight.hibernatfundamentals.airport.Payment;
import com.piuralsight.hibernatfundamentals.airport.Ticket;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernatefundamentals.m06.ex01");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        Ticket ticket = new Ticket();
        ticket.setNumber("AA1234");
        ticket.setOrigin("London");
        ticket.setDestination("Moscow");

        Payment payment = new Payment();
        payment.setTicket(ticket);
        payment.setAmount(200);


// persist(save) all created objects ane by one meaning that we insert into the db
        // a corresponding record with their information

        em.persist(ticket);
        em.persist(payment);



        em.getTransaction().commit();
        emf.close();

    }
}
