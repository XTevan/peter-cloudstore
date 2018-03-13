package com.hilst.petercloudstore.controller;

import com.hilst.petercloudstore.model.Film;
import com.hilst.petercloudstore.service.FilmService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;


@RestController
@RequestMapping("/api/films")
public class FilmController {

    private final FilmService filmService;

    public FilmController(FilmService filmService) {
        this.filmService = filmService;
    }
    @RequestMapping("")
    public Collection<Film> getFilms(){
        return filmService.findAll();
    }
}
