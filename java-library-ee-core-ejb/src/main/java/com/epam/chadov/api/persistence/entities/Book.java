package com.epam.chadov.api.persistence.entities;

import javax.validation.constraints.NotNull;
import javax.persistence.*;

/**
 * @author Andrey_Chadov on 3/2/2017.
 */
public class Book extends Entity{

    @NotNull
    private String title;

    @NotNull
    private String author;

    @NotNull
    private String genre;

    /**
     * Creates a new Book object.
     */
    public Book() {

    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

}
