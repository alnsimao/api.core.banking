package aln.core.baking.domain.model;

import org.springframework.cglib.core.Local;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Transaction {
    private long id;
    private BigDecimal value;
    private LocalDate creationDate;
    private Account origin;
    private Account destination;
}
