package ch.bzz.model;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Booking data class
 */
@Getter
@Setter
public class Booking {
    private Long id;
    private LocalDate date;
    private String text;
    private Account debitAccount;
    private Account creditAccount;
    private BigDecimal amount;
    private Project project;
}
