package de.presti.ree6.sql.entities.arty;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "RolePermissions", indexes = @Index(columnList = "id"))
public class RolePermissions {

    @Id
    @Column(name = "id", nullable = false, unique = true)
    private String id;

    @OneToMany(mappedBy = "parent", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private List<RolePermissionValues> longValues;

    public RolePermissions() {
    }

    public RolePermissions(String id) {
        this.id = id;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public List<RolePermissionValues> getLongValues() {
        return longValues;
    }

    public void setLongValues(List<RolePermissionValues> longValues) {
        this.longValues = longValues;
    }
}

