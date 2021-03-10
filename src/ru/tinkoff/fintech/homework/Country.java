package ru.tinkoff.fintech.homework;

import java.util.Scanner;

public enum Country { // п. 1.
    RUSSIA("Россия", true),
    USA("США", true),
    CANADA("Канада", true); // Объявляем объекты, а создаём объекты (объекты перечисления) в Main

    private final String ruName; // п. 1.2.
    private final boolean isOpen; // п. 1.2.

    Country(String ruName, boolean isOpen) { // п.1.2.1.
        this.ruName = ruName;
        this.isOpen = isOpen;
    }

    @Override
    public String toString() {
        return "(" + ruName + ")";
    }


//        if (input.contains("RUSSIA")) { // пункт 4 реализовано
//            System.out.println("Страна [" + rvalue.name() + "] " + Country.valueOf("RUSSIA") + " открыта для посещения");
//        }


    //    public void foo(){ // Создаем обычный метод и у каждого объекта можем его вызвать
//        System.out.println(Country.RUSSIA + " " + "(" + Country.RUSSIA.getRuName() + ")");
//        System.out.println(Country.USA + " " + "(" + Country.USA.getRuName() + ")");
//        System.out.println(Country.CANADA + " " + "(" + Country.CANADA.getRuName() + ")");
//    }

}

