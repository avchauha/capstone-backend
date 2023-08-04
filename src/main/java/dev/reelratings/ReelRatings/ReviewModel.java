package dev.reelratings.ReelRatings;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "reviews")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReviewModel {
    private ObjectId id;
    private String body;


    public ReviewModel(String body) {
        this.body = body;
    }
}
