package com.yapir.playground.pet;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.Instant;
import java.util.UUID;

@Entity
public class PetEntity {
    @Id
    private UUID id;
    private Instant birthDate;
    private String name;

    public UUID getId() {
        return id;
    }

    public PetEntity setId(UUID id) {
        this.id = id;
        return this;
    }

    public Instant getBirthDate() {
        return birthDate;
    }

    public PetEntity setBirthDate(Instant birthDate) {
        this.birthDate = birthDate;
        return this;
    }

    public String getName() {
        return name;
    }

    public PetEntity setName(String name) {
        this.name = name;
        return this;
    }
}
