package com.reciporia.Reciporia.model.entity;

import com.reciporia.Reciporia.model.entity.enums.UserRoleEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "roles")
@Getter
@Setter
@NoArgsConstructor
public class UserRole extends BaseEntity {

    @Column(name = "role", nullable = false, unique = true)
    @Enumerated(value = EnumType.STRING)
    private UserRoleEnum role;

    public UserRole setRole(UserRoleEnum role) {
        this.role = role;
        return this;
    }

}
