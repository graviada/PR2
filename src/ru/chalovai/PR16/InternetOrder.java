package ru.chalovai.PR16;

// Создайте класс InternetOrder, который моделирует сущность интернет заказ в ресторане или кафе. Класс основан
// на циклическом двусвязном списке с выделенной головой и может хранить как блюда, так и напитки.
// Внимание: список реализуется самостоятельно.

public class InternetOrder implements Order {
    private ListNode front;
    private int count;

    // Конструкторы:
    // −не принимающий параметров (для списка создается только головной элемент, сам список пуст).
    public InternetOrder() {
        front = null;
    }

    // −принимающий массив позиций заказа ( создаем список из N позиций).
    public InternetOrder(RestaurantOrder order) {
        Dish[] dishes = order.getAllDishes();
        Drink[] drinks = order.getAllDrinks();
        for (Dish dish : dishes) {
            add(dish);
        }
        for (Drink drink : drinks) {
            add(drink);
        }
    }

    // Методы:
    // − добавляющий позицию в заказ (принимает ссылку типа Item). Пока этот метод возвращает истину после выполнения операции добавления элемента.

    // Вспомогательный метод, проверяет заказ на "пустоту" (количество позиций в заказе, равное 0)
    public boolean isEmpty() {
        return count == 0;
    }

    // Добавляет позицию Напиток в заказ
    public boolean add(Drink drink) {
        try {
            if (isEmpty())
                front = new ListNode(drink);
            else {
                ListNode temp = front;
                front = new ListNode(null, drink, temp);
                front.next.previous = front;
            }
            count++;
            return true;
        }
        catch (Exception e) {
            return false;
        }
    }

    // Добавляет позицию Блюдо в заказ
    public boolean add(Dish dish) {
        try {
            if (isEmpty())
                front = new ListNode(dish);
            else {
                ListNode temp = front;
                front = new ListNode(null, dish, temp);
                front.next.previous = front;
            }
            count++;
            return true;
        }
        catch (Exception e) {
            return false;
        }
    }

    // − удаляющий позицию из заказа по его названию (принимает название блюда или напитка в качестве параметра).
    // Если позиций с заданным названием несколько, всегда удаляются последние. Возвращает логическое значение
    // (true, если элемент был удален).
    public boolean remove(String name) {
        if (isEmpty())
            return false;

        if (front.dish != null) {
            if (front.dish.getName().equals(name)) {
                front = front.next;
                return true;
            }
        }

        if (front.drink != null) {
            if (front.drink.getName().equals(name)) {
                front = front.next;
                return true;
            }
        }

        ListNode current = front;
        boolean flag = true;

        while (flag) {
            current = current.next;
            if (current == null) {
                flag = false;
            } else if (current.dish != null) {
                if (current.dish.getName().equals(name)) {
                    flag = false;
                }
            } else if (current.drink != null) {
                if (current.drink.getName().equals(name)) {
                    flag = false;
                }
            }
        }

        if (current == null)
            return false;

        if (current.next != null)
            current.next.previous = current.previous;

        current.previous.next = current.next;
        count--;
        return true;
    }

    // − удаляющий все позиции с заданным именем (принимает название в качестве параметра).
    // Возвращает число удаленных элементов.
    public void removeAll(String name) {
        boolean flag = true;
        while (flag) {
            if (!remove(name)) {
                flag = false;
            }
        }
    }

    // − возвращающий общее число позиций заказа (повторяющиеся тоже считаются) в заказе.
    public int getCount() {
        return count;
    }

    // − возвращающий массив заказанных блюд и напитков (значений null в массиве быть не должно).
    public RestaurantOrder getOrder() {
        RestaurantOrder order = new RestaurantOrder();
        if (!isEmpty()) {
            ListNode temp = front;
            while (temp != null) {
                if (temp.dish != null) {
                    order.add(temp.dish);
                } else if (temp.drink != null) {
                    order.add(temp.drink);
                }
                temp = temp.next;
            }
        }
        return order;
    }

    // − возвращающий общую стоимость заказа.
    public double priceTotal() {
        double cost = 0;
        if (!isEmpty()) {
            ListNode temp = front;
            while (temp != null) {
                if (temp.dish != null) {
                    cost += temp.dish.getPrice();
                } else if (temp.drink != null) {
                    cost += temp.drink.getPrice();
                }
                temp = temp.next;
            }
        }
        return cost;
    }

    // − возвращающий число заказанных блюд или напитков (принимает название блюда или напитка в качестве параметра).
    public double CostTotal(String s) {
        double cost = 0;
        if (!isEmpty()) {
            ListNode temp = front;
            while (temp != null) {
                if (temp.dish != null) {
                    cost += temp.dish.getPrice();
                } else if (temp.drink != null) {
                    cost += temp.drink.getPrice();
                }
                temp = temp.next;
            }
        }
        return cost;
    }

    // − возвращающий массив названий заказанных блюд и напитков (без повторов).
    public int getOrderQuantity(String name) {
        int quantity = 0;
        if (!isEmpty()) {
            ListNode temp = front;
            while (temp != null) {
                if (temp.dish != null) {
                    if (temp.dish.getName().equals(name)) {
                        quantity++;
                    }
                } else if (temp.drink != null) {
                    if (temp.drink.getName().equals(name)) {
                        quantity++;
                    }
                }
                temp = temp.next;
            }
        }
        return quantity;
    }


    // − возвращающий массив позиций заказа, отсортированный по убыванию цены.
    public Drink[] getDrinks() {
        Drink[] drinks = new Drink[6];
        boolean flag = true;
        if (!isEmpty()) {
            ListNode temp = front;
            while (temp != null) {
                if (temp.drink != null) {
                    for (int i = 0; i < 6; i++) {
                        if (drinks[i] != null) {
                            if (temp.drink.getName().equals(drinks[i].getName())) {
                                flag = false;
                            }
                        }
                    }
                    if (flag) {
                        for (int i = 0; i < 6; i++) {
                            if (drinks[i] == null) {
                                drinks[i] = temp.drink;
                                break;
                            }
                        }
                    }
                    flag = true;
                }
                temp = temp.next;
            }
        }
        return drinks;
    }

    public Dish[] getDish() {
        Dish[] dishes = new Dish[6];
        boolean flag = true;
        if (!isEmpty()) {
            ListNode temp = front;
            while (temp != null) {
                if (temp.dish != null) {
                    for (int i = 0; i < 6; i++) {
                        if (dishes[i] != null) {
                            if (temp.dish.getName().equals(dishes[i].getName())) {
                                flag = false;
                            }
                        }
                    }
                    if (flag) {
                        for (int i = 0; i < 6; i++) {
                            if (dishes[i] == null) {
                                dishes[i] = temp.dish;
                                break;
                            }
                        }
                    }
                    flag = true;
                }
                temp = temp.next;
            }
        }
        return dishes;
    }
}
