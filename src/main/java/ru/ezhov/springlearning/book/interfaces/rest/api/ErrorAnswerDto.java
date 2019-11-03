package ru.ezhov.springlearning.book.interfaces.rest.api;

public class ErrorAnswerDto {
    private boolean status = false;
    private String msg;

    private ErrorAnswerDto(String msg) {
        this.msg = msg;
    }

    public static ErrorAnswerDto from(String msg) {
        return new ErrorAnswerDto(msg);
    }

    public boolean isStatus() {
        return status;
    }

    public String getMsg() {
        return msg;
    }

}
