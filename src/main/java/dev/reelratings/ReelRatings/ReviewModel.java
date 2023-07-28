package dev.reelratings.ReelRatings;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "reviews")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReviewModel {
    private Integer id;
    private String body;

    public ReviewModel(String body) {
        this.body = body;
    }
}

