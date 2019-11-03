package ru.ezhov.springlearning.book.interfaces.rest.api;

import ru.ezhov.springlearning.book.domain.model.Book;

public class BookAnswerDto {
    private String guid;
    private String author;
    private String name;

    private BookAnswerDto(String guid, String author, String name) {
        this.guid = guid;
        this.author = author;
        this.name = name;
    }

    public static BookAnswerDto from(Book book) {
        return new BookAnswerDto(book.guid(), book.author(), book.name());
    }

    public String getGuid() {
        return guid;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }
}
