package com.uade.tpo.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
import java.util.Set;

@Data
@Entity
public class Category {

    public Category() {
    }

    public Category(String description) {
        this.description = description;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String description;

    @OneToMany(mappedBy = "category")
    private Set<Cars> car;
}
