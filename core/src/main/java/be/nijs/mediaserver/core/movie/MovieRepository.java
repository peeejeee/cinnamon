package be.nijs.cinnamon.core.movie;

import org.springframework.data.repository.CrudRepository;

interface MovieRepository extends CrudRepository<Movie, Long> {
}
