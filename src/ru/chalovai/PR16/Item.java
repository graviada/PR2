package ru.chalovai.PR16;

// Создайте интерфейс Item – для работы с позициями заказа.

public interface Item {
    // Интерфейс определяет 3 метода:
    // − возвращает стоимость.
    double getPrice();

    // − возвращает описание позиции.
    String getDescription();

    // − возвращает название.
    String getName();
}
