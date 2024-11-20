CREATE TABLE RolePermissions
(
    id   VARCHAR(255)       NOT NULL,
    CONSTRAINT pk_rolepermissions PRIMARY KEY (id)
);

CREATE TABLE RolePermissionsValues
(
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    parent_id VARCHAR(255) NOT NULL,
    role BIGINT,
    CONSTRAINT pk_rolepermissions_values FOREIGN KEY (parent_id) REFERENCES RolePermissions(id)
);
