package сom.manko.cinema.movie.service.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Value;

@Value
@Builder(builderMethodName = "movieInfo")
@JsonIgnoreProperties(ignoreUnknown = true)
public class MovieInfo {

    private String title;
    private int movieRatingId;
    private String releaseYear;
    private int languageId;

    @JsonCreator
    public MovieInfo(@JsonProperty String title,
                     @JsonProperty int movieRatingId,
                     @JsonProperty String releaseYear,
                     @JsonProperty int languageId) {
        this.title = title;
        this.movieRatingId = movieRatingId;
        this.releaseYear = releaseYear;
        this.languageId = languageId;
    }
}