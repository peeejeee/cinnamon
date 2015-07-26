package be.nijs.cinnamon.rest.movie;

import be.nijs.cinnamon.core.movie.Movie;
import be.nijs.cinnamon.core.movie.MovieTestBuilder;
import be.nijs.cinnamon.rest.AbstractIntegrationTest;
import org.assertj.core.api.StrictAssertions;
import org.junit.Test;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import static org.assertj.core.api.StrictAssertions.assertThat;

public class MovieControllerIntegrationTest extends AbstractIntegrationTest {

    public static final String TITLE = "Mad Max";
    public static final String FILE_NAME = "/Mad Max/Mad Max.avi";

    RestTemplate restTemplate = new TestRestTemplate();

    @Test
    public void createMovie() throws Exception {
        Movie movie = MovieTestBuilder.aMovie()
                .withTitle(TITLE)
                .withFileName(FILE_NAME)
                .build();

        ResponseEntity<Movie> actual = restTemplate.postForEntity("http://localhost:8080/movie", movie, Movie.class);
        assertThat(actual.getStatusCode()).isEqualTo(HttpStatus.CREATED);

        StrictAssertions.assertThat(actual.getBody().getId()).isNotNull();
        StrictAssertions.assertThat(actual.getBody().getTitle()).isEqualTo(TITLE);
        StrictAssertions.assertThat(actual.getBody().getFileName()).isEqualTo(FILE_NAME);
    }
}