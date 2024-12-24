package com.reciporia.Reciporia.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "categories")
@Getter
@Setter
public class Category extends BaseEntity {

    @Column(unique = true, nullable = false)
    private String name;

    @Column(unique = true)
    private String description;

    //TODO List Of Recipes!

}
