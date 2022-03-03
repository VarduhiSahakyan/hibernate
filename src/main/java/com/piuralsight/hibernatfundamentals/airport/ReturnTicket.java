package com.piuralsight.hibernatfundamentals.airport;

import javax.persistence.AssociationOverride;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "RETURN_TICKET")
@AssociationOverride(name = "passenger",joinColumns = @JoinColumn(name = "pass_id"))
public class ReturnTicket extends Ticket {

    private LocalDate latestReturnDate;

    public LocalDate getLatesReturnDate() {
        return latestReturnDate;
    }

    public void setLatesReturnDate(LocalDate latesReturnDate) {
        this.latestReturnDate = latesReturnDate;
    }
}
