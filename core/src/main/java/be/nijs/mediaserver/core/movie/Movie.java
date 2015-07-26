package be.nijs.cinnamon.core.movie;

import javax.persistence.*;

@Entity
@Table(name = "MOVIES")
public class Movie {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "TITLE", nullable = false)
    private String title;

    @Column(name = "FILE_NAME", nullable = false)
    private String fileName;

    public Movie() {
    }

    public Movie(String title, String fileName) {
        this.title = title;
        this.fileName = fileName;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getFileName() {
        return fileName;
    }
}
