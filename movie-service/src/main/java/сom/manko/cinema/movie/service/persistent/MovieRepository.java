package сom.manko.cinema.movie.service.persistent;

import org.springframework.data.repository.CrudRepository;
import сom.manko.cinema.movie.service.domain.MovieEntity;

public interface MovieRepository extends CrudRepository<MovieEntity, Long> {
}