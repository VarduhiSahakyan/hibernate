package com.piuralsight.hibernatfundamentals.airport;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CountriesHibernateTest {

    private EntityManagerFactory emf;
    private EntityManager em;

    private List<Country> expectedCountiesList = new ArrayList<>();

    public static final String[][] COUNTRY_INIT_DATA = {
            {"Australia", "AU"},
            {"Canada", "CA"},
            {"Armenia", "AM"},
            {"France", "FR"},
            {"Germany", "DE"},
            {"Italy", "IT"}};

    @BeforeEach
    public void setUp() {
        initExpectedCountriesList();
        emf = Persistence.createEntityManagerFactory("hibernatefundamentals.m03.ex07");
        em = emf.createEntityManager();

        em.getTransaction().begin();
        for (int i = 0; i < COUNTRY_INIT_DATA.length; i++) {
            String[] countryInitData = COUNTRY_INIT_DATA[i];
            Country country = new Country(countryInitData[0], countryInitData[1]);
            em.persist(country);
        }
        em.getTransaction().commit();
    }

    @Test
    public void testCountriesList() {
        List<Country> countriesList = em.createQuery("select c from Country c").getResultList();
        Assertions.assertNotNull(countriesList);
        Assertions.assertEquals(COUNTRY_INIT_DATA.length, countriesList.size());
        for (int i = 0; i < expectedCountiesList.size(); i++) {
            Assertions.assertEquals(expectedCountiesList.get(i), countriesList.get(i));
        }
    }

    @AfterEach
    public void dropDown() {
        em.close();
        emf.close();

    }

    private void initExpectedCountriesList() {
        for (int i = 0; i < COUNTRY_INIT_DATA.length; i++) {
            String[] countryInitData = COUNTRY_INIT_DATA[i];
            Country country = new Country(countryInitData[0], countryInitData[1]);
            expectedCountiesList.add(country);
        }
    }
}
