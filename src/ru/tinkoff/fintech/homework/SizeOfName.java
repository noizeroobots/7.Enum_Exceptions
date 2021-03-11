package ru.tinkoff.fintech.homework;

public class SizeOfName {

    public final void checkName(final String input) throws NoSuchCountryException, IncorrectInputException {
        if (!input.equals("")) {
            throw new NoSuchCountryException("Страны без нормлаьного названия не существует");
        } else {
            throw new IncorrectInputException("Ошибка! Пустая строка");
        }

    }
}
/* Собственное checked исключение основано на вводе страны с длиной 0 символов */