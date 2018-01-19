package pl.npp.nopodajpodajserver.model.reservation;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * @author Paweł Lelental
 **/
@Data
@Entity
public class Term {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private boolean isTaken;
    private Date date;
    @ManyToOne
    private Reservation reservation;
}
