package dev.reelratings.ReelRatings;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieCatalogService {

    @Autowired
    private MovieRepository movieRepository;

    public List<MovieModel> getAllMovies() {
        return movieRepository.findAll();
    }

    public Optional<MovieModel> findMovieByMovieId(String movieId) {
        return movieRepository.findMovieByMovieId(movieId);
    }
}

