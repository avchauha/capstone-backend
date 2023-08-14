package dev.reelratings.ReelRatings;

import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@CrossOrigin(origins = "https://sage-truffle-5179a2.netlify.app/")
@RequestMapping("/movies/{movieId}/reviews")
public class ReviewController {
    private final ReviewService service;

    public ReviewController(ReviewService service) {
        this.service = service;
    }

    @PostMapping()
    public ResponseEntity<ReviewModel> createReview(@PathVariable String movieId, @RequestBody ReviewRequest reviewRequest)
    {
        String reviewBody = reviewRequest.getReviewBody();
        Integer stars = reviewRequest.getReviewStars();
        ReviewModel createdReview = service.createReview(reviewBody,stars, movieId);
        return new ResponseEntity<>(createdReview, HttpStatus.OK);
    }



}






