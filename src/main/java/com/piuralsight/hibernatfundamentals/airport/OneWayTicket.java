package com.piuralsight.hibernatfundamentals.airport;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
public class OneWayTicket extends Ticket {

    private LocalDate lastDepartureDate;

    public LocalDate getLastDepartureDate() {
        return lastDepartureDate;
    }

    public void setLastDepartureDate(LocalDate lastDepartureDate) {
        this.lastDepartureDate = lastDepartureDate;
    }
}
