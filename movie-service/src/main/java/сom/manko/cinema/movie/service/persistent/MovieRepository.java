package сom.manko.cinema.movie.service.persistent;

import org.springframework.data.repository.CrudRepository;
import сom.manko.cinema.movie.service.model.Movie;

public interface MovieRepository extends CrudRepository<Movie, Long> {
}