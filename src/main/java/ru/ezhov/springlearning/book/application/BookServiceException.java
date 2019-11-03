package ru.ezhov.springlearning.book.application;

public class BookServiceException extends Exception {
    public BookServiceException(String message, Throwable cause) {
        super(message, cause);
    }
}
