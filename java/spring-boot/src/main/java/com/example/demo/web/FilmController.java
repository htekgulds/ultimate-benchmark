package com.example.demo.web;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Film;
import com.example.demo.repository.FilmRepository;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/films")
@RequiredArgsConstructor
public class FilmController {
    private final FilmRepository repository;


    @GetMapping
    public List<Film> getFilms() {
        return repository.findAll();
    }
    
}
