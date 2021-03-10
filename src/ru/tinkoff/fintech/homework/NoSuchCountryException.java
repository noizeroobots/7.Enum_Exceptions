package ru.tinkoff.fintech.homework;

public class NoSuchCountryException {

    public void getSize(String input) {

        SizeOfName sizeOfName = new SizeOfName();

        try {
            sizeOfName.setName(input);
        } catch (SizeException e) {
            e.printStackTrace();
        }
    }
}
