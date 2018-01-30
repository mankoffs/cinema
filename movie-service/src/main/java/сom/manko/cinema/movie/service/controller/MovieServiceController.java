package сom.manko.cinema.movie.service.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import сom.manko.cinema.movie.service.domain.MovieEntity;
import сom.manko.cinema.movie.service.dto.MovieInfo;
import сom.manko.cinema.movie.service.manager.MovieManager;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

@RestController
@RequestMapping("/movie")
@Slf4j
public class MovieServiceController {

    @Autowired
    private MovieManager movieManager;

    @GetMapping(value = "/getMovie", produces = APPLICATION_JSON_UTF8_VALUE)
    public MovieInfo getMovie(@RequestParam Long movieId) {
        log.info("Get movie by movieId:{}", movieId);
        MovieInfo movie = movieManager.getMovie(movieId);
        log.info("Result for movieId:{}, result:{}", movieId, movie);
        return movie;
    }

    @GetMapping(value = "/getMovies")
    public List<MovieEntity> getMovies() {
        log.info("Get all movies");
        return movieManager.getMovies();

    }
}