package ru.chalovai.PR16;

// Order должен хранить (удалять и добавлять) не только экземпляры класса Dish, но и Drink
// (Для этого разработайте классы Order и TablesOrderManager).

import ru.chalovai.PR16.Dish;
import ru.chalovai.PR16.Drink;

public interface Order {
    boolean add(Dish dish);

    boolean add(Drink drink);

    boolean remove(String name);

    void removeAll(String name);

    int getCount();

    double priceTotal();
}
