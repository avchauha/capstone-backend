package dev.reelratings.ReelRatings;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.time.LocalDateTime;

@Document(collection = "reviews")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReviewModel {
    private ObjectId id;
    private String body;
    private Integer stars;
    public ReviewModel(String body, Integer stars) {
        this.body = body;
        this.stars = stars;
    }
}
