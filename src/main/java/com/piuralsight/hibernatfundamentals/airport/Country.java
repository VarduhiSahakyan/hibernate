package com.piuralsight.hibernatfundamentals.airport;

import javax.persistence.*;

@Entity
@Table(name = "COUNTRIES")
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "CODE_NAME")
    private String codeName;

    public Country() {
    }

    public Country(String name, String codeName) {
        this.name = name;
        this.codeName = codeName;
    }


}
