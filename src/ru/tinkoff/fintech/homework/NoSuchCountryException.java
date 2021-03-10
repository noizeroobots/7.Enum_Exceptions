package ru.tinkoff.fintech.homework;

public class NoSuchCountryException extends Exception {
    public NoSuchCountryException(final String message) {
        super(message);
    }
}
/* Собственное checked исключение основано на вводе страны с длиной 0 символов */