package ru.tinkoff.fintech.homework;


public class Main {

    public static void main(String[] args) {

        for (Country country : Country.values()) { // пункт 2
            System.out.println(country.name() + " " + country.toString());
        }

        GetByRuName show = new GetByRuName();
        show.getByRuName();


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


