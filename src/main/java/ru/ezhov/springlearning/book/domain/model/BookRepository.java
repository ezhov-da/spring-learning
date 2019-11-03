package ru.ezhov.springlearning.book.domain.model;

import java.util.List;

public interface BookRepository {
    List<Book> all() throws BookRepositoryException;
}
