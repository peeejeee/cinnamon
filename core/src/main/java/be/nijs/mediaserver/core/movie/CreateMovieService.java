package be.nijs.cinnamon.core.movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CreateMovieService {

    @Autowired
    private MovieRepository movieRepository;

    public Movie createMovie(Movie movie) {
        Movie movie1 = movieRepository.save(movie);
//
//        if (movie1 != null) {
//            throw new RuntimeException();
//        }
        return movie1;
    }
}
