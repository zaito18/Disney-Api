package com.example.challengev2.service;

import com.example.challengev2.model.Movie;
import com.example.challengev2.util.dto.MovieDTO;
import com.example.challengev2.util.dto.MovieDTOII;
import com.example.challengev2.util.dto.MovieDTOIII;
import org.springframework.util.MultiValueMap;

import java.util.List;

public interface MovieService {
     List<MovieDTOII> getAllMoviesDTOII(MultiValueMap<String, String> params);

    List<MovieDTOIII> getAllMovies();

    void save(MovieDTO movie);

    void delete(Long id);

    Movie getMovieById(Long id);

    void update(Long idMovie, MovieDTO movieDetails);

}
