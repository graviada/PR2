package ru.chalovai.PR16;

// Создайте класс Drink – напитка. Класс описывает сущность – напиток и характеризуется следующими свойствами - стоимостью,
// названием и описанием. Класс должен быть определен как неизменяемый (Immutable class).
// Для этого обозначим его как final, и все поля так же сделаем неизменяемыми.
// Конструктор классов Drink и Dish должен выбрасывать исключение java.lang.IllegalArgumentException при попытке создать
// блюдо или напиток со стоимостью меньше 0, без имени или описания (если параметры имя и описание - пустые строки).

public final class Drink implements Item {
    private final String name, description;
    private final double price;

    // Конструкторы:
    // −принимающий три параметра – стоимость, название и описание.
    public Drink(String name, String description, double price) throws Exception {
        this.name = name;
        this.description = description;
        this.price = price;
        if (name.equals("") || description.equals("") || price == 0)
            // Исключение java.lang.IllegalArgumentException
            throw new Exception("java.lang.IllegalArgumentException ");
    }

    // −принимающий два параметра – название и описание. Стоимость при этом инициализируется значением 0;
    public Drink(String name, String description) throws Exception {
        this.name = name;
        this.description = description;
        this.price = 0;
        // Исключение java.lang.IllegalArgumentException
        throw new Exception("java.lang.IllegalArgumentException ");
    }

    // Методы:
    // − возвращающий стоимость.
    public double getPrice() {
        return price;
    }

    // − возвращающий описание.
    public String getDescription() {
        return description;
    }

    // − возвращающий название.
    public String getName() {
        return name;
    }

    public String toString() {
        return "Цена: " + price + ", Напиток: " + name;
    }
}
