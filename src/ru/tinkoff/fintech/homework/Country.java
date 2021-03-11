package ru.tinkoff.fintech.homework;

public enum Country {
    RUSSIA("Россия", false),
    USA("США", true),
    CANADA("Канада", true);

    private final String ruName;
    private final boolean isOpen;

    Country(final String ruName, final boolean isOpen) {
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

