package ru.tinkoff.fintech.homework;


public class Main {

    public static void main(final String[] args) {
        System.out.println("checkpoint 1");
        for (Country country : Country.values()) { // пункт 2
            System.out.println(country.name() + " " + country.toString());
        }
        System.out.println("checkpoint 2");

        GetByRuName show = new GetByRuName();
        show.getByRuName();

        System.out.println("checkpoint 4");


    }
// Первый способ создания объекта
//        System.out.println(rvalue.getRuName());
//        System.out.println(rvalue.isOpen());

//       Country uvalue = Country.valueOf(Country.class, "USA"); // Второй способ создания объекта
//       System.out.println(rvalue + " " + uvalue); // Выводим созданные объекты

}


