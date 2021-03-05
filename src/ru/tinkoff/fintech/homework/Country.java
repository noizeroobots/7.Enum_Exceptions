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
}
