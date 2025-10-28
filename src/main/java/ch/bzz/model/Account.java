package ch.bzz.model;

import lombok.Getter;
import lombok.Setter;

/**
 * Account data class
 */
@Getter
@Setter
public class Account {
    private Long id;
    private String accountNumber;
    private String name;
    private Project project;
}
