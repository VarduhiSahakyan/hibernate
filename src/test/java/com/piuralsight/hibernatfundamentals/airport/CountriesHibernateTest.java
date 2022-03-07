package com.piuralsight.hibernatfundamentals.airport;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration("classpath:application-context.xml")
public class CountriesHibernateTest {

    @Autowired
    private CountryService countryService;


    private List<Country> expectedCountiesList = new ArrayList<>();


    @BeforeEach
    public void setUp() {
        countryService.init();
        initExpectedCountriesList();

    }

    @Test
    public void testCountriesList() {
        List<Country> countriesList = countryService.getAllCauntries();
        Assertions.assertNotNull(countriesList);
        Assertions.assertEquals(countryService.COUNTRY_INIT_DATA.length, countriesList.size());
        for (int i = 0; i < expectedCountiesList.size(); i++) {
            Assertions.assertEquals(expectedCountiesList.get(i), countriesList.get(i));
        }
    }

    @AfterEach
    public void dropDown() {
        countryService.clear();

    }

    private void initExpectedCountriesList() {
        for (int i = 0; i < countryService.COUNTRY_INIT_DATA.length; i++) {
            String[] countryInitData = CountryService.COUNTRY_INIT_DATA[i];
            Country country = new Country(countryInitData[0], countryInitData[1]);
            expectedCountiesList.add(country);
        }
    }
}
