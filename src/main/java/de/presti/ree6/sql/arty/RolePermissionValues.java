package de.presti.ree6.sql.arty;

import jakarta.persistence.*;

@Entity
@Table(name = "RolePermissionValues")
public class RolePermissionValues {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-generate IDs for the child table rows
    private Long id;

    @ManyToOne
    @JoinColumn(name = "parent_id", nullable = false) // FK to the parent table
    private RolePermissions parent;

    @Column(name = "role", nullable = false)
    private Long role;

    public RolePermissionValues() {
    }

    public RolePermissionValues(RolePermissions parent, Long role) {
        this.parent = parent;
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public RolePermissions getParent() {
        return parent;
    }

    public Long role() {
        return role;
    }


}
