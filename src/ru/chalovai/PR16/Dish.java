package ru.chalovai.PR16;

// Класс Dish сделайте неизменяемым (аналогично Drink).
// Конструктор классов Drink и Dish должен выбрасывать исключение java.lang.IllegalArgumentException при попытке создать
// блюдо или напиток со стоимостью меньше 0, без имени или описания (если параметры имя и описание - пустые строки).

public final class Dish implements Item {
    private final String name, description;
    private final double price;

    public Dish(String name, String description, double price) throws Exception {
        this.name = name;
        this.description = description;
        this.price = price;
        if (name.equals("") || description.equals("") || price == 0)
            // Исключение java.lang.IllegalArgumentException
            throw new Exception("java.lang.IllegalArgumentException ");

    }

    public Dish(String name, String description) throws Exception {
        this.name = name;
        this.description = description;
        this.price = 0;
        // Исключение java.lang.IllegalArgumentException
        throw new Exception("java.lang.IllegalArgumentException ");
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Цена: " + price + ", Блюдо: " + name;
    }
}
