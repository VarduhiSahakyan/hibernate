package com.piuralsight.hibernatfundamentals.airport;

import javax.persistence.*;

@Entity
@Table(name = "PAYMENTS")
public class Payment {

    @Id
    @GeneratedValue
    private int id;

    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "TICKET_ID",referencedColumnName = "ID"),
            @JoinColumn(name = "TICKET_NUMBER",referencedColumnName = "NUMBER")
    })
    private Ticket ticket;

    private int amount;

    public int getId() {
        return id;
    }


    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
