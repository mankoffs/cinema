package сom.manko.cinema.movie.service.service;


import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.CollectionUtils;
import сom.manko.cinema.movie.service.domain.MovieEntity;
import сom.manko.cinema.movie.service.persistent.MovieRepository;

import javax.annotation.PostConstruct;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

@Slf4j
public class MovieService {

    private MovieRepository movieRepository;

    private volatile Map<Long, MovieEntity> movies = Collections.emptyMap();

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @PostConstruct
    public void load() {
        log.info("Initialization of movie configuration was launched..");
        List<MovieEntity> tempList = Lists.newArrayList(movieRepository.findAll());
        if (!CollectionUtils.isEmpty(tempList)) {
            Map<Long, MovieEntity> tempMap = tempList.stream()
                    .sorted(Comparator.comparingLong(MovieEntity::getMovieId))
                    .collect(Collectors.toMap(MovieEntity::getMovieId, Function.identity(), (e1, e2) -> e1, LinkedHashMap::new));
            movies = ImmutableMap.copyOf(tempMap);
        }
        log.info("Initialized configuration of movie with result:{}", movies);
    }

    /**
     * Retrieving copy of movies configuration list
     *
     * @return cached list of movies configuration
     */
    public Map<Long, MovieEntity> getMovies() {
        return movies;
    }

    /**
     * Return {@link Optional} result of representation movie
     *
     * @param movieId - required movie id
     * @return optional result of representation movie
     */
    public Optional<MovieEntity> getMovie(Long movieId) {
        log.debug("Searching movie by movieId:{} will be performed!", movieId);

        Optional<MovieEntity> movie;

        if (Objects.nonNull(movieId)) {
            movie = Optional.ofNullable(movieRepository.findOne(movieId));
            return Objects.nonNull(movie) ? movie : Optional.empty();
        }

        return Optional.empty();
    }

    private MovieEntity toUserMedalDto(Long movieId) {
        return null;
    }



    //    Optional<List<MovieEntity>> getAllMovies();
//
//    Optional<MovieEntity> getMovie(long movieId);

//    MovieEntity createMovie();
//
//    void deleteMovie(long movieId);
//
//    void deleteAllMovies();
}
