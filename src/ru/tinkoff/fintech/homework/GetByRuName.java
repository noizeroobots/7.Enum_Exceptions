package ru.tinkoff.fintech.homework;

import java.util.Scanner;

public class GetByRuName {

    public static void getByRuName() {

        Country rvalue = Country.RUSSIA;
        Country uvalue = Country.USA;
        Country cvalue = Country.CANADA;

        Scanner in = new Scanner(System.in); // п.3.
        System.out.println("Enter the name of the chosen country: ");
        String input = in.nextLine();

        switch (input) {
            case ("Россия"):
                System.out.println(rvalue.name());
                break;
            case ("США"):
                System.out.println(uvalue.name());
                break;
            case ("Канада"):
                System.out.println(cvalue.name());
                break;
            default:
                System.out.println("sdf");
        }

    }

}
