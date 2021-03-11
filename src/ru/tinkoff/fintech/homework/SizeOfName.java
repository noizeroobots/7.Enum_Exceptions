package ru.tinkoff.fintech.homework;

public class SizeOfName {

    public final void checkName(final String input) throws NoSuchCountryException, IncorrectInputException {
        if (!input.equals("")) {
            throw new NoSuchCountryException("Страны \"" + input + "\" не существует");
        } else {
            throw new IncorrectInputException("Ошибка! Пустая строка");
        }
    }
}
