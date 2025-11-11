package ch.bzz.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

/**
 * Project data class
 */
@Entity
@Table(name = "project")
@Getter
@Setter
public class Project {
    @Id
    @Column(name = "project_name", nullable = false, unique = true, length = 100)
    private String projectName;
    
    @Column(name = "password_hash", nullable = false, length = 255)
    private String passwordHash;
}
