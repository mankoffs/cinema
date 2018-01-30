package сom.manko.cinema.movie.service.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import сom.manko.cinema.movie.service.manager.MovieManager;
import сom.manko.cinema.movie.service.persistent.MovieRepository;
import сom.manko.cinema.movie.service.service.MovieService;

@Configuration
public class MovieConfiguration {

    @Bean
    public MovieManager movieManager(MovieService movieService) {
        return new MovieManager(movieService);
    }

    @Bean
    public MovieService movieService(MovieRepository movieRepository) {
        return new MovieService(movieRepository);
    }
}