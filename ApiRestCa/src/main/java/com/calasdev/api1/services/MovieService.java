package com.calasdev.api1.services;

import com.calasdev.api1.entities.Movie;

import java.util.List;
import java.util.Optional;

public interface MovieService {
    List<Movie> getAllMovies();
    Optional<Movie> getMovieById(Long id);
    Movie saveMovie(Movie movie);
    void deleteMovie(Long id);
    Movie updateMovie(Long id, Movie movie);

}
