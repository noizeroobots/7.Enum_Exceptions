package ru.tinkoff.fintech.homework;

public class IncorrectInputException extends Exception {
    public IncorrectInputException(final String message) {
        super(message);
    }
}
/* Собственное checked исключение основано на вводе страны с длиной 0 символов */