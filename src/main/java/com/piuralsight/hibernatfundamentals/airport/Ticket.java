package com.piuralsight.hibernatfundamentals.airport;


import javax.persistence.*;

@MappedSuperclass
public abstract class Ticket {

    @Id
    @GeneratedValue
    private int id;
    private String number;

    @ManyToOne
    @JoinColumn(name = "passenger_id")
    private Passenger passenger;

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public int getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

}
