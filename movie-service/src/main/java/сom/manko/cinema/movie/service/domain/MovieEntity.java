package сom.manko.cinema.movie.service.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "movie")
@Builder
public class MovieEntity {

    @Id
    @Column(name = "movie_id", columnDefinition = "integer")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long movieId;

    @Column(name = "title")
    private String title;

    @Column(name = "movie_rating_id")
    private int movieRatingId;

    @Column(name = "release_year")
    private String releaseYear;

    @Column(name = "language_id")
    private int languageId;
}