package ru.tinkoff.fintech.homework;

public class SizeOfName {


    public void setName(String input) throws SizeException {
        if (input.equals("")) {
            throw new SizeException("Страны без названия не существует");
        }

    }
}
