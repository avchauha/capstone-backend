package dev.reelratings.ReelRatings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/movies")
public class MovieCatalogController {

    @Autowired
    private MovieCatalogService movieCatalogService;

    @GetMapping
    public ResponseEntity<List<MovieModel>>getAllMovies() {
        return new ResponseEntity<List<MovieModel>>(movieCatalogService.getAllMovies(), HttpStatus.OK);
    }

    @GetMapping("/{movieId}/reviews")
    public ResponseEntity<MovieModel> getMovieById(@PathVariable String movieId) {
        Optional<MovieModel> movie = movieCatalogService.findMovieByMovieId(movieId);
        if (movie.isPresent()) {
            return new ResponseEntity<>(movie.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
