package aln.core.baking.domain.model;

import java.math.BigDecimal;

public class Account {
    private Long id;
    private String accountNumber;
    private BigDecimal balance;
    private Client client;
}
