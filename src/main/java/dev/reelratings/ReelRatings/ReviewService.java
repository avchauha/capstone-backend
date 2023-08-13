package dev.reelratings.ReelRatings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ReviewService {

    private final ReviewRepository reviewRepository;
    private final MovieRepository movieRepository;

    @Autowired
    public ReviewService(ReviewRepository reviewRepository, MovieRepository movieRepository) {
        this.reviewRepository = reviewRepository;
        this.movieRepository = movieRepository;
    }

    public ReviewModel createReview(String reviewBody, Integer stars, String movieId) {

        ReviewModel review = new ReviewModel(reviewBody, stars);
        reviewRepository.insert(review);

        Optional<MovieModel> movieByMovieId = movieRepository.findMovieByMovieId(movieId);

        if (movieByMovieId.isPresent()) {
            MovieModel movie = movieByMovieId.get();
            movie.getReviews().add(review);
            movieRepository.save(movie);
        } else {
            throw new IllegalArgumentException("Movie not found for movieId : " + movieId);
        }
        return review;
    }
}

