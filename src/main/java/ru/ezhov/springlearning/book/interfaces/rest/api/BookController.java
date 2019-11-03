package ru.ezhov.springlearning.book.interfaces.rest.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.ezhov.springlearning.book.application.BookService;
import ru.ezhov.springlearning.book.application.BookServiceException;
import ru.ezhov.springlearning.book.domain.model.Book;

import java.util.List;

@RestController
@RequestMapping(path = "books")
public class BookController {
    private static final Logger LOG = LoggerFactory.getLogger(BookController.class);
    private BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping(produces = "application/json;charset=utf-8")
    public ResponseEntity<Object> books() {
        ResponseEntity<Object> response;
        try {
            List<Book> books = bookService.all();
            response = new ResponseEntity<>(BooksAnswerDto.from(books), HttpStatus.OK);
        } catch (BookServiceException e) {
            LOG.error("Ошибка получения списка книг", e);

            ObjectMapper mapper = new ObjectMapper();
            ObjectNode node = mapper.createObjectNode();
            node.put("status", false);
            node.put("msg", e.getMessage());

            response = new ResponseEntity<>(ErrorAnswerDto.from(e.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return response;
    }
}
