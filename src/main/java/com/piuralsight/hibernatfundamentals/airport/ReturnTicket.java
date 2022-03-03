package com.piuralsight.hibernatfundamentals.airport;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
public class ReturnTicket extends Ticket {

    private LocalDate latesReturnDate;

    public LocalDate getLatesReturnDate() {
        return latesReturnDate;
    }

    public void setLatesReturnDate(LocalDate latesReturnDate) {
        this.latesReturnDate = latesReturnDate;
    }
}
