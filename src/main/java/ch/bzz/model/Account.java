package ch.bzz.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

/**
 * Account data class
 */
@Entity
@Table(name = "account")
@Getter
@Setter
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    
    @Column(name = "account_number", nullable = false, unique = true, length = 20)
    private String accountNumber;
    
    @Column(name = "name", nullable = false, length = 100)
    private String name;
    
    @ManyToOne
    @JoinColumn(name = "project_name", nullable = false)
    private Project project;
}
