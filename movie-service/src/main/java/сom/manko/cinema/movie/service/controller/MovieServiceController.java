package сom.manko.cinema.movie.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import сom.manko.cinema.movie.service.model.Movie;
import сom.manko.cinema.movie.service.persistent.MovieRepository;

@RestController
public class MovieServiceController {

    @Autowired
    private MovieRepository movieRepository;

    @GetMapping(value = "/movie")
    public Movie getMovie(@RequestParam long movieId) {
        return movieRepository.findOne(movieId);
    }

    @GetMapping(value = "/movieAll")
    public Iterable<Movie> getAllMovie() {
        return movieRepository.findAll();
    }
}