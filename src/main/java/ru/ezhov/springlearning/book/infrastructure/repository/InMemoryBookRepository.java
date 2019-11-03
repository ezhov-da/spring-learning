package ru.ezhov.springlearning.book.infrastructure.repository;

import org.springframework.stereotype.Repository;
import ru.ezhov.springlearning.book.domain.model.Book;
import ru.ezhov.springlearning.book.domain.model.BookRepository;
import ru.ezhov.springlearning.book.domain.model.BookRepositoryException;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryBookRepository implements BookRepository {

    private List<Book> books;

    @PostConstruct
    private void generateBooks() {
        books = new ArrayList<>();
        books.add(Book.from("Мать", "Максим Горький"));
        books.add(Book.from("Герой нашего времени", "Михаил Лермонтов"));
    }

    @Override
    public List<Book> all() throws BookRepositoryException {
        return books;
    }
}
