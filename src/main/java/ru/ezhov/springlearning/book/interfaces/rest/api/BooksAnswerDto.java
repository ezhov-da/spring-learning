package ru.ezhov.springlearning.book.interfaces.rest.api;

import ru.ezhov.springlearning.book.domain.model.Book;

import java.util.ArrayList;
import java.util.List;

public class BooksAnswerDto {
    private boolean status = true;

    private List<BookAnswerDto> books;

    private BooksAnswerDto(List<Book> books) {
        this.books = new ArrayList<>();
        for (Book book : books) {
            this.books.add(BookAnswerDto.from(book));
        }
    }

    public static BooksAnswerDto from(List<Book> books){
        return new BooksAnswerDto(books);
    }

    public boolean isStatus() {
        return status;
    }

    public List<BookAnswerDto> getBooks() {
        return books;
    }
}
