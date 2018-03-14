package com.hilst.petercloudstore.repository;

import com.hilst.petercloudstore.model.Film;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface FilmRepository extends Repository<Film, UUID> {

    List<Film> findAll();

    Optional<Film> findById(UUID id);

    Film save(Film film);

    void delete(Film film);
}
