package ru.tinkoff.fintech.homework;

public class Main {

    public static void main(final String[] args) {

        for (Country country : Country.values()) {
            System.out.println(country.name() + " " + country.toString());
        }

        GetByRuName show = new GetByRuName();
        show.getByRuName();
    }
}


