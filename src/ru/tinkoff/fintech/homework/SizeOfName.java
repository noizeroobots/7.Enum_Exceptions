package ru.tinkoff.fintech.homework;

public class SizeOfName {

    public final void setName(final String input) throws NoSuchCountryException {
        if (!input.equals("")) {
            throw new NoSuchCountryException("Страны без названия не существует");
        }

    }
}
/* Собственное checked исключение основано на вводе страны с длиной 0 символов */