package dev.reelratings.ReelRatings;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "movies")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MovieModel {
    @Id
    private ObjectId id;
//    private Integer id;
    private String title;
    private String releaseDate;
    private List<String> genres;
    // Next Steps create an embedded relationship b/w MovieModel & ReviewModel

}

