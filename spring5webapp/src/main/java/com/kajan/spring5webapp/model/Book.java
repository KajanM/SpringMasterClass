package com.kajan.spring5webapp.model;

import java.util.HashSet;
import java.util.Set;

public class Book {
    private String title;
    private String isbn;
    private String pulisher;

    private Set<Author> authors = new HashSet<>();

    public Book() {
    }

    public Book(String title, String isbn, String pulisher) {
        this.title = title;
        this.isbn = isbn;
        this.pulisher = pulisher;
    }

    public Book(String title, String isbn, String pulisher, Set<Author> authors) {
        this.title = title;
        this.isbn = isbn;
        this.pulisher = pulisher;
        this.authors = authors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getPulisher() {
        return pulisher;
    }

    public void setPulisher(String pulisher) {
        this.pulisher = pulisher;
    }

    public Set<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    }
}
