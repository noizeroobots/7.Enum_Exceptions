package ru.tinkoff.fintech.homework;

public enum Country { // п. 1.
    RUSSIA("Россия", false),
    USA("США", true),
    CANADA("Канада", true); // Объявляем объекты, а создаём объекты (объекты перечисления) в Main

    private final String ruName; // п. 1.2.
    private final boolean isOpen; // п. 1.2.

    Country(final String ruName, final boolean isOpen) { // п.1.3
        this.ruName = ruName;
        this.isOpen = isOpen;
    }

    @Override
    public String toString() {
        return "(" + ruName + ")";
    }

    public boolean isOpen() {
        return isOpen;
    }


}

