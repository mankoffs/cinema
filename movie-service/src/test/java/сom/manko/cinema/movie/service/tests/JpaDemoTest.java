package сom.manko.cinema.movie.service.tests;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import сom.manko.cinema.movie.service.model.Movie;
import сom.manko.cinema.movie.service.persistent.MovieRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JpaDemoTest {

    @Autowired
    private MovieRepository movieRepository;

    @Test
    public void finMovieById() {
        Movie allMovies = movieRepository.findOne(1L);
        Assert.assertNotNull(allMovies);
    }

    @Test
    public void finAllMovies() {
        Iterable<Movie> allMovies = movieRepository.findAll();
        Assert.assertNotNull(allMovies);
    }

    @Test
    public void createMovie() {
        Movie movie = movieRepository.save(movieBuilder());
        Assert.assertNotNull(movie);
    }

    private Movie movieBuilder() {
        return Movie.builder()
                .movieId(2)
                .title("Mask")
                .movieRatingId(2)
                .releaseYear("1980")
                .languageId(2)
                .build();
    }
}