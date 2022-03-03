package com.piuralsight.hibernatfundamentals;

import com.piuralsight.hibernatfundamentals.airport.Department;
import com.piuralsight.hibernatfundamentals.airport.Manager;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernatefundamentals.m06.ex01");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        Manager john = new Manager("John Smith");
        Department accounting = new Department();
        accounting.setName("Accounting");
        john.setDepartment(accounting);


// persist(save) all created objects ane by one meaning that we insert into the db
        // a corresponding record with their information
        em.persist(john);
        em.persist(accounting);



        em.getTransaction().commit();
        emf.close();

    }
}
