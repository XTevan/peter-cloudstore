package com.hilst.petercloudstore.service;

import com.hilst.petercloudstore.model.Film;
import com.hilst.petercloudstore.repository.FilmRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;
import java.util.UUID;

@Service
public class FilmService {

    private static final Logger LOGGER = LoggerFactory.getLogger(FilmService.class.getName());

    private final FilmRepository filmRepository;

    @Autowired
    public FilmService(FilmRepository filmRepository) {
        this.filmRepository = filmRepository;
    }

    public Collection<Film> findAll() {
        return filmRepository.findAll();
    }

    public Optional<Film> findById(UUID id) {
        return filmRepository.findById(id);
    }

    public Film create(Film film) {
        return filmRepository.save(film);
    }

}
