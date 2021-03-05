package ru.tinkoff.fintech.homework;

public enum Country {
    RUSSIA("Россия", true),
    USA("США", true),
    CANADA("Канада", true); // Объявляем объекты, а создаём объекты (объекты перечисления) в Main

    private final String ruName; // отвечает за наименование на русском
    private final boolean isOpen; // отвечает за то, открыта ли для посещения

    Country(String ruName, boolean isOpen) {
        this.ruName = ruName;
        this.isOpen = isOpen;
    }

    public String getRuName() {
        return ruName;
    }

    public boolean isOpen() {
        return isOpen;
    }

//    public void foo(){ // Создаем обычный метод и у каждого объекта можем его вызвать
//        System.out.println(Country.RUSSIA + " " + "(" + Country.RUSSIA.getRuName() + ")");
//        System.out.println(Country.USA + " " + "(" + Country.USA.getRuName() + ")");
//        System.out.println(Country.CANADA + " " + "(" + Country.CANADA.getRuName() + ")");
//    }

    public void rvalue() { // Создаем обычный метод и у каждого объекта можем его вызвать

        if (Country.RUSSIA.equals(RUSSIA)) {
            System.out.println(Country.RUSSIA + " " + "(" + Country.RUSSIA.getRuName() + ")");
        }
    }

    public void uvalue() {

        if (Country.USA.equals(USA)) {
            System.out.println(Country.USA + " " + "(" + Country.USA.getRuName() + ")");
        }
    }

    public void cvalue() {

        if (Country.CANADA.equals(CANADA)) {
            System.out.println(Country.CANADA + " " + "(" + Country.CANADA.getRuName() + ")");
        }
    }
}

