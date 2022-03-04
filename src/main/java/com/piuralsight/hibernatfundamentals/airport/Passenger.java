package com.piuralsight.hibernatfundamentals.airport;

import javax.persistence.*;

@Entity
@Table(name = "PASSENGERS")
public class Passenger {
    @Id
    @GeneratedValue
    private int id;
    private String name;

    @Convert(converter = VipConverter.class)
    private boolean vip;

    public Passenger() {
    }

    public Passenger(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean isVip() {
        return vip;
    }
}
