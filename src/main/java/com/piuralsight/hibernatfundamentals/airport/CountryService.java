package com.piuralsight.hibernatfundamentals.airport;

import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class CountryService {

    @PersistenceContext
    private EntityManager em;

    public static final String[][] COUNTRY_INIT_DATA = {
            {"Australia", "AU"},
            {"Canada", "CA"},
            {"Armenia", "AM"},
            {"France", "FR"},
            {"Germany", "DE"},
            {"Italy", "IT"}};

    @Transactional
    public void init() {
        for (int i = 0; i < COUNTRY_INIT_DATA.length; i++) {
            String[] countryInitData = COUNTRY_INIT_DATA[i];
            Country country = new Country(countryInitData[0], countryInitData[1]);
            em.persist(country);
        }
    }

    @Transactional
    public void clear() {
        em.createQuery("delete from Country c").executeUpdate();

    }

    public List<Country> getAllCauntries() {
        return em.createQuery("select c from Country c").getResultList();
    }
}
