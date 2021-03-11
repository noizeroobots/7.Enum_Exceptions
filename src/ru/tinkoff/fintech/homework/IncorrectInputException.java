package ru.tinkoff.fintech.homework;

public class IncorrectInputException extends Exception {
    public IncorrectInputException(final String message) {
        super(message);
    }
}
