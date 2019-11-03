package ru.ezhov.springlearning.book.domain.model;

import java.util.UUID;

public class Book {
    private String guid;
    private String author;
    private String name;

    private Book(String guid, String name, String author) {
        this.guid = guid;
        this.name = name;
        this.author = author;
    }

    public static Book from(String name, String author) {
        return new Book(UUID.randomUUID().toString(), name, author);
    }

    public String guid() {
        return guid;
    }

    public String author() {
        return author;
    }

    public String name() {
        return name;
    }
}
