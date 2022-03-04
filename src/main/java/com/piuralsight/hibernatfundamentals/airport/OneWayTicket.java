package com.piuralsight.hibernatfundamentals.airport;


import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "ONE_WAY_TICKETS")
public class OneWayTicket extends Ticket {

    private LocalDate lastDepartureDate;

    public LocalDate getLastDepartureDate() {

        return lastDepartureDate;
    }

    public void setLastDepartureDate(LocalDate lastDepartureDate) {

        this.lastDepartureDate = lastDepartureDate;
    }
}
