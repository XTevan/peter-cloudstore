package com.hilst.petercloudstore;

import com.hilst.petercloudstore.model.Film;
import com.hilst.petercloudstore.repository.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.UUID;

@SpringBootApplication
public class Application {

    @Autowired
    private static FilmRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

        Film film = new Film(UUID.randomUUID(),
                "I'm All Right Jack",
                LocalDate.of(1959,8,18),
                "United Kingdom",
                "English",
                "A naive aristocrat in search of a career becomes caught up in the struggles between his profit-minded uncle and an aggressive labour union.");


        repository.save(film);
    }
}
