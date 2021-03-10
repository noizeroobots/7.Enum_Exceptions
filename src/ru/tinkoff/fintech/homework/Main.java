package ru.tinkoff.fintech.homework;


public class Main {

    public static void main(final String[] args) {

        for (Country country : Country.values()) { // пункт 2
            System.out.println(country.name() + " " + country.toString());
        }

        GetByRuName show = new GetByRuName();
        show.getByRuName();


    }
// Первый способ создания объекта
//        System.out.println(rvalue.getRuName());
//        System.out.println(rvalue.isOpen());

//       Country uvalue = Country.valueOf(Country.class, "USA"); // Второй способ создания объекта
//       System.out.println(rvalue + " " + uvalue); // Выводим созданные объекты

}


