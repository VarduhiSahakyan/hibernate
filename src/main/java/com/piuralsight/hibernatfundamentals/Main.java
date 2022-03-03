package com.piuralsight.hibernatfundamentals;

import com.piuralsight.hibernatfundamentals.airport.Address;
import com.piuralsight.hibernatfundamentals.airport.Passenger;

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
        Address address = new Address();

        address.setNumber("3");
        address.setStreet("Flowers Street");
        address.setZipCode("012345");
        address.setCity("Boston");
        john.setAddres(address);


// persist(save) all created objects ane by one meaning that we insert into the db
        // a corresponding record with their information

        em.persist(john);



        em.getTransaction().commit();
        emf.close();

    }
}
