package com.piuralsight.hibernatfundamentals.airport;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
@DiscriminatorValue("O")
public class OneWayTicket extends Ticket {

    private LocalDate lastDepartureDate;

    public LocalDate getLastDepartureDate() {

        return lastDepartureDate;
    }

    public void setLastDepartureDate(LocalDate lastDepartureDate) {

        this.lastDepartureDate = lastDepartureDate;
    }
}
