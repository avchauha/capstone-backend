package dev.reelratings.ReelRatings;

import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/reviews")
public class ReviewController {
    @Autowired
    private ReviewService service;

    @PostMapping()
    public ResponseEntity<ReviewModel> createReview(@RequestBody Map<String, String> payload) {
        return new ResponseEntity<ReviewModel>(service.createReview(payload.get("reviewBody"), payload.get("movieId")), HttpStatus.OK);
    }

}




// Potential Patch and Delete EndPoints

//PATCH --does not work yet
//  @PatchMapping("/{reviewIds}")
//  public ResponseEntity<ReviewModel> updateReview(@PathVariable Long reviewId, @RequestBody Map<String, String> payload) {
//
//    ReviewModel existingReview = service.getReviewById(reviewId);
//    if (existingReview == null) {
//        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//    }
//    if (movieId != null) {
//        existingReview.setMovieId(movieId);
//    }
//    return new ResponseEntity<>(updatedReview, HttpStatus.OK);
//}

//DELETE





