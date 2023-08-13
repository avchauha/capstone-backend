package dev.reelratings.ReelRatings;

public class ReviewRequest {
    private String reviewBody;
    private Integer reviewStars;

    public String getReviewBody() {
        return reviewBody;
    }

    public Integer getReviewStars() {
        return reviewStars;
    }

    public void setReviewBody(String reviewBody) {
        this.reviewBody = reviewBody;
    }

    public void setReviewStars(Integer reviewStars) {
        this.reviewStars = reviewStars;
    }
}
