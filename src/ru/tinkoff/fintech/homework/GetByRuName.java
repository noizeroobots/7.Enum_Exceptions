package ru.tinkoff.fintech.homework;

import java.util.Scanner;

public class GetByRuName {

    @SuppressWarnings("checkstyle:WhitespaceAround")
    public static void getByRuName() {

        Country rvalue = Country.RUSSIA;
        Country uvalue = Country.USA;
        Country cvalue = Country.CANADA;

        Scanner in = new Scanner(System.in); // п.3.
        System.out.print("Введите название страны: ");
        String input = in.nextLine();


        switch (input) {
            case ("Россия"):
                System.out.println(getInformation(rvalue));
                break;
            case ("США"):
                System.out.println(getInformation(uvalue));
                break;
            case ("Канада"):
                System.out.println(getInformation(cvalue));
                break;
            default:
                try {
                    Country country = Country.valueOf(input);
                    System.out.println(getInformation(country));
                } catch (IllegalArgumentException e) {
                    checkInput(input);
                }
        }
        System.out.println("checkpoint 3");

    }

    private static String getInformation(final Country country){

        String result = country.name();

        if (country.isOpen()){
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
//
            System.out.println("Страны \'" + input + "\' не существует");
        } catch (IncorrectInputException e) {
            System.out.println(e.getMessage());
        }
    }

}
