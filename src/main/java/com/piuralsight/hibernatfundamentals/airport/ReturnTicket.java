package com.piuralsight.hibernatfundamentals.airport;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
@DiscriminatorValue("R")
public class ReturnTicket extends Ticket {

    private LocalDate latestReturnDate;

    public LocalDate getLatesReturnDate() {
        return latestReturnDate;
    }

    public void setLatesReturnDate(LocalDate latesReturnDate) {

        this.latestReturnDate = latesReturnDate;
    }
}
