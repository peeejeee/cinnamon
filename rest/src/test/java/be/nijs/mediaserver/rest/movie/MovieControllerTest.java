package be.nijs.cinnamon.rest.movie;

import be.nijs.cinnamon.core.movie.CreateMovieService;
import be.nijs.cinnamon.core.movie.Movie;
import be.nijs.cinnamon.test_utils.MockitoTestCase;
import org.junit.Test;
import org.mockito.Mock;
import org.unitils.inject.annotation.InjectIntoByType;
import org.unitils.inject.annotation.TestedObject;

import static org.assertj.core.api.StrictAssertions.assertThat;
import static org.mockito.Mockito.when;

public class MovieControllerTest extends MockitoTestCase {

    @TestedObject
    private MovieController movieController;

    @Mock
    @InjectIntoByType
    private CreateMovieService createMovieService;

    @Mock
    private Movie movie;

    @Mock
    private Movie createdMovie;

    @Test
    public void createMovie() throws Exception {
        when(createMovieService.createMovie(movie)).thenReturn(createdMovie);

        assertThat(movieController.createMovie(movie)).isEqualTo(createdMovie);
    }
}