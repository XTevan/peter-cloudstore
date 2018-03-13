package com.hilst.petercloudstore.model;

import org.hibernate.annotations.Type;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.UUID;

@Entity
public class Film {

    @Id
    @GeneratedValue
    @Type(type="uuid-char")
    private UUID id;
    private String name;
    private LocalDate released;
    private String country;
    private String language;
    private String summary;

    public Film(UUID id, String name, LocalDate released, String country, String language, String summary) {
        this.id = id;
        this.name = name;
        this.released = released;
        this.country = country;
        this.language = language;
        this.summary = summary;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getReleased() {
        return released;
    }

    public void setReleased(LocalDate released) {
        this.released = released;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
}
