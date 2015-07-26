package be.nijs.cinnamon.rest.movie;

import be.nijs.cinnamon.core.movie.CreateMovieService;
import be.nijs.cinnamon.core.movie.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/movie")
public class MovieController {

    @Autowired
    private CreateMovieService createMovieService;

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Movie createMovie(@RequestBody Movie movie) {
        return createMovieService.createMovie(movie);
    }
}
