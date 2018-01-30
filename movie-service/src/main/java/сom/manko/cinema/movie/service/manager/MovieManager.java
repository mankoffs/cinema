package сom.manko.cinema.movie.service.manager;

import lombok.extern.slf4j.Slf4j;
import сom.manko.cinema.movie.service.domain.MovieEntity;
import сom.manko.cinema.movie.service.dto.MovieInfo;
import сom.manko.cinema.movie.service.exception.MovieServiceException;
import сom.manko.cinema.movie.service.service.MovieService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static java.lang.String.format;

@Slf4j
public class MovieManager {

    private MovieService movieService;

    public MovieManager(MovieService movieService) {
        this.movieService = movieService;
    }

    /**
     * Return result of representation movie
     *
     * @param movieId - required movie id
     * @return result of representation movie
     */
    public MovieInfo getMovie(Long movieId) {
        log.info("Retrieving movie data for movieId:{}!", movieId);
        Optional<MovieEntity> movie = movieService.getMovie(movieId);

        if (!movie.isPresent()) {
            String msg = format("Movie was not presented in database for movieId:%d!", movieId);
            log.error("Movie was not presented in database!");
            throw new MovieServiceException(msg);
        }

        MovieEntity movieEntity = movie.get();
        MovieInfo movieInfo = MovieInfo.movieInfo()
                .title(movieEntity.getTitle())
                .languageId(movieEntity.getLanguageId())
                .movieRatingId(movieEntity.getMovieRatingId())
                .releaseYear(movieEntity.getReleaseYear())
                .build();

        log.debug("Retrieving movie was finished with result:{}!", movieInfo);
        return movieInfo;
    }

    /**
     * Return {@link Optional} list of representation movies
     *
     * @return result of representation movie
     */
    public List<MovieEntity> getMovies() {
        return new ArrayList<>(movieService.getMovies().values());
    }
}