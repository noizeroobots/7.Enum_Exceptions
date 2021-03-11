package ru.tinkoff.fintech.homework;

import java.util.Scanner;

public class GetByRuName {

    @SuppressWarnings("checkstyle:WhitespaceAround")
    public static void getByRuName() {

        Country rvalue = Country.RUSSIA;
        Country uvalue = Country.USA;
        Country cvalue = Country.CANADA;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите название страны: ");
        String input = in.nextLine();

        switch (input) {
            case ("Россия"):
                System.out.println("Наименование страны на английском введено некорректно, нужно русское название...");
                System.out.println("Страна [" + getInformation(rvalue));
                break;
            case ("США"):
                System.out.println("Наименование страны на английском введено некорректно, нужно русское название...");
                System.out.println("Страна [" + getInformation(uvalue));
                break;
            case ("Канада"):
                System.out.println("Наименование страны на английском введено некорректно, нужно русское название...");
                System.out.println("Страна [" + getInformation(cvalue));
                break;
            default:
                try {
                    Country country = Country.valueOf(input);
                    System.out.println("Страна [" + getInformation(country) + " ");
                } catch (IllegalArgumentException e) {
                    checkInput(input);
                }
        }
    }

    private static String getInformation(final Country country) {

        String result = country.name() + " " + country.toString() + "]";

        if (country.isOpen()) {
            result += " открыта для посещения";
        } else {
            result += " закрыта для посещения";
        }
        return result;
    }

    public static void checkInput(final String input) {

        SizeOfName sizeOfName = new SizeOfName();

        try {
            sizeOfName.checkName(input);
        } catch (NoSuchCountryException e) {
            System.out.println("Наименование страны на английском введено некорректно, нужно русское название...");
            System.err.println(e.getMessage());
        } catch (IncorrectInputException e) {
            System.out.println("Наименование страны на английском введено некорректно, нужно русское название...");
            System.err.println(e.getMessage());
        }
    }
}
