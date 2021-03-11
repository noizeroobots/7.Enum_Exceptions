package ru.tinkoff.fintech.homework;

public class NoSuchCountryException extends Exception {
    public NoSuchCountryException(final String message) {
        super(message);
    }
}
