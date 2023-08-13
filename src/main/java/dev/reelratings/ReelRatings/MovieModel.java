package dev.reelratings.ReelRatings;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "movies")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MovieModel {
    @Id
    private ObjectId id;
    private String movieId;
    private String title;
    private String releaseDate;
    private String trailer;
    private String summary;
    private String posterPhoto;
    private List<String> backdropPhotos;
    private List<String> genres;
    @DocumentReference
    private List<ReviewModel> reviews;


    public MovieModel(String movieId, String title, String releaseDate, String trailer, String posterPhoto, List<String> backdropPhotos, List<String> genres ) {
        this.movieId = movieId;
        this.title = title;
        this.releaseDate = releaseDate;
        this.trailer = trailer;
        this.posterPhoto = posterPhoto;
        this.backdropPhotos = backdropPhotos;
        this.genres = genres;

    }


}

