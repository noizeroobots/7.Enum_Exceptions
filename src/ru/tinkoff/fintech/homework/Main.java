package ru.tinkoff.fintech.homework;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Country rvalue = Country.RUSSIA;

        for (Country country : Country.values()) { // пункт 2
            System.out.println(country.name() + " " + country.toString());
        }

        Scanner in = new Scanner(System.in); // п.3.
        System.out.println("Enter the name of the chosen country: ");
        String input = in.nextLine();

        if (input.contains("RUSSIA")) { // пункт 4 реализовано
            System.out.println("Страна [" + rvalue.name() + "] " + Country.valueOf("RUSSIA") + " открыта для посещения");
        }
    }

//        switch (input) {
//            case ("RUSSIA"):
//                System.out.println("hello russia english first");
//                break;
//            case ("Россия"):
//                System.out.println("hello russian russian first");
//                break;
//            default:
//                System.out.println("В случае, если страна не найдена, метод getByRuName() должен выбрасывать исключение NoSuchCountryException");
//        }

    // Первый способ создания объекта
//        System.out.println(rvalue.getRuName());
//        System.out.println(rvalue.isOpen());


//       Country uvalue = Country.valueOf(Country.class, "USA"); // Второй способ создания объекта
//       System.out.println(rvalue + " " + uvalue); // Выводим созданные объекты

}


