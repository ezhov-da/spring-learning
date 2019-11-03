package ru.ezhov.springlearning.book.application;

import org.springframework.stereotype.Service;
import ru.ezhov.springlearning.book.domain.model.Book;
import ru.ezhov.springlearning.book.domain.model.BookRepository;
import ru.ezhov.springlearning.book.domain.model.BookRepositoryException;

import java.util.List;

@Service
public class BookService {
    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> all() throws BookServiceException {
        try {
            return bookRepository.all();
        } catch (BookRepositoryException e) {
            throw new BookServiceException("Ошибка при получении списка книг", e);
        }
    }
}
