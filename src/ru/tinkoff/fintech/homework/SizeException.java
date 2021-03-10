package ru.tinkoff.fintech.homework;

public class SizeException {

    public final void getSize(final String input) {

        SizeOfName sizeOfName = new SizeOfName();

        try {
            sizeOfName.setName(input);
        } catch (NoSuchCountryException e) {
//
            System.out.println("Страны \'" + input + "\' не существует");
        }
    }
}
/* Собственное checked исключение NoSuchCountryException1 основано на вводе страны с длиной 0 символов */