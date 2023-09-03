package com.example.demo.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.example.demo.entity.Film;

public interface FilmRepository extends ReactiveCrudRepository<Film, Integer> {
        
}
