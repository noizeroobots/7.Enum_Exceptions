package ru.tinkoff.fintech.homework;

import java.util.Scanner;

public class GetByRuName {

    public static void getByRuName() {

        Country rvalue = Country.RUSSIA;
        Country uvalue = Country.USA;
        Country cvalue = Country.CANADA;

        Scanner in = new Scanner(System.in); // п.3.
        System.out.print("Введите название страны: ");
        String input = in.nextLine();

        SizeException sizeName = new SizeException();


        switch (input) {
            case ("RUSSIA"):
            case ("Россия"):
                System.out.println(rvalue.name() + rvalue.isOpen());
                break;
            case ("USA"):
            case ("США"):
                System.out.println(uvalue.name());
                break;
            case ("CANADA"):
            case ("Канада"):
                System.out.println(cvalue.name());
                break;
            default:
                sizeName.getSize(input);
        }
        System.out.println("checkpoint 4");
        if (input.equals("")){
            System.out.println("Вы ввели ни один символ");
        }
        if (rvalue.isOpen()) {
            System.out.println(" открыта для посещения");
        } else {
            System.out.println(" закрыта для посещения");
        }

    }


}
