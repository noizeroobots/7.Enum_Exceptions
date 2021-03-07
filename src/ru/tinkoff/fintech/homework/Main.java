package ru.tinkoff.fintech.homework;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Country rvalue = Country.RUSSIA;
        Country uvalue = Country.USA;
        Country cvalue = Country.CANADA;

        System.out.println(rvalue.name() + " " + Country.RUSSIA.toString());
        System.out.println(uvalue.name() + " " + Country.USA.toString());
        System.out.println(cvalue.name() + " " + Country.CANADA.toString() + "\n");

        Scanner in = new Scanner(System.in); // п.3.
        System.out.println("Enter the name of the chosen country: ");
        String input = in.nextLine();

         // Первый способ создания объекта
//        System.out.println(rvalue.getRuName());
//        System.out.println(rvalue.isOpen());


//       Country uvalue = Country.valueOf(Country.class, "USA"); // Второй способ создания объекта
//       System.out.println(rvalue + " " + uvalue); // Выводим созданные объекты

//       rvalue.name(); // Выводит имя нашего объекта
//       System.out.println(rvalue.name());

//       for (Country i: Country.values()) {
//           System.out.println(i);
    }

}

/*
+ 1. Создать enum Country:
+ 1.1. Элементы - различные страны, придумайте сами.
+ 1.2. Два private final поля: String ruName (отвечает за наименование на русском) и boolean isOpen (отвечает за то, открыта ли для посещения).
+    Установить соответствующие значения полей для каждой из стран, используя конструктор;
  1.3. Переопределить метод toString, чтобы он возвращал информацию о стране в формате "<Наименование на английском> (<наименование на русском>)";
  1.4. Создать статический метод getByRuName(), возвращающий Country-элемент, найденный среди всех элементов по наименованию на русском;
    В случае, если страна не найдена, метод getByRuName() должен выбрасывать исключение NoSuchCountryException.
    Для этого написать собственное checked исключение;

  2. В начале выполнения программы вывести в консоль список доступных стран, используя цикл и переопределённый метод toString();

+ 3. Реализовать систему обработки ввода при помощи Scanner(System.in);

  4. Используя введённое значение (условно обозначим его здесь как input), попытаться получить Country-элемент по имени на латинице через valueOf(input).
    При вызове valueOf() могут выскакивать исключения двух типов. Необходимо предусмотреть каждый тип и обрабатывать отдельными блоками catch.
    В обработке выводить в консоль причину ошибки с собственной формулировкой. Продолжать выполнение кода;

  5. В случае, если по имени на латинице Country-элемент получить не удалось, получить его, используя метод getByRus(input).
    Обрабатывать исключение NoCountryException (см. п.1.4.) - в обработке выводить в консоль сообщение "Страны '<...>' не существует".
    Продолжать выполнение кода;

  6. В случае удачного получения Country-элемента вывести в консоль информацию о том, открыта ли эта страна для посещения, используя поле isOpen;

  7. Проверить код при помощи CheckStyle и SpotBugs, добиться полного отсутствия проблем.
 */