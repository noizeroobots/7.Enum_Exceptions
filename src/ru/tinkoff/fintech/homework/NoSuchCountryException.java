package ru.tinkoff.fintech.homework;

public class NoSuchCountryException {

    public final void getSize(final String input) {

        SizeOfName sizeOfName = new SizeOfName();

        try {
            sizeOfName.setName(input);
        } catch (SizeException e) {
            e.printStackTrace();
        }
    }
}
