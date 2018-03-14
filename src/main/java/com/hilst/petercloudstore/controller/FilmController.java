package com.hilst.petercloudstore.controller;

import com.hilst.petercloudstore.model.Film;
import com.hilst.petercloudstore.service.FilmService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Optional;
import java.util.UUID;


@RestController
@RequestMapping("/api/films")
public class FilmController {

    private final FilmService filmService;

    public FilmController(FilmService filmService) {
        this.filmService = filmService;
        Film film = new Film(UUID.randomUUID(),
                "I'm All Right Jack",
                LocalDate.of(1959, 8, 18),
                "United Kingdom",
                "English",
                "A naive aristocrat in search of a career becomes caught up in the struggles between his profit-minded uncle and an aggressive labour union.");

        this.filmService.create(film);
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Collection<Film>> getFilms() {
        return new ResponseEntity(filmService.findAll(), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public ResponseEntity<Film> getFilmById(@PathVariable("id") UUID id) {
        Optional<Film> film = filmService.findById(id);
        ResponseEntity<Film> result = new ResponseEntity<>(HttpStatus.NOT_FOUND);
        if (film.isPresent()) {
            result = new ResponseEntity<>(film.get(), HttpStatus.OK);
        }

        return result;
    }
}
