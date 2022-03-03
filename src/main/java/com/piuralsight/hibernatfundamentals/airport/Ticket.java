package com.piuralsight.hibernatfundamentals.airport;


import javax.persistence.*;


@Entity
@Table(name = "TICKETS")
public class Ticket {

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private int id;

    @Column(name = "NUMBER")
    private String number;

    @Column
    private String origin;
    @Column
    private String destination;


    public Ticket() {
    }

    public Ticket(String number) {
        this.number = number;
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

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
}
