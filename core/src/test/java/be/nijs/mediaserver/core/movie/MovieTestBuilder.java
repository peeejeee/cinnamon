package be.nijs.cinnamon.core.movie;

public class MovieTestBuilder {

    private String title;
    private String fileName;

    public Movie build() {
        return new Movie(title, fileName);
    }
    
    public static MovieTestBuilder aMovie() {
        return new MovieTestBuilder();
    }
    
    private MovieTestBuilder() {}

    public MovieTestBuilder withTitle(String title) {
        this.title = title;
        return this;
    }

    public MovieTestBuilder withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
}