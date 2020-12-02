package ru.chalovai.PR16;

// Создайте объявляемое исключение OrderAlreadyAddedException, выбрасываемое при попытке добавить заказ столику или по адресу,
// если со столиком или адресатом уже связан заказ.

import java.util.HashMap;

public class OrderManager {
    // Добавьте ему еще одно поле типа java.util.HasMap<String, Order>, которое содержит пары адрес-заказ,
    // и методы (работающие с этим полем)
    private HashMap<Integer, RestaurantOrder> restaurantOrderHashMap;
    private HashMap<String, InternetOrder> internetOrderHashMap;

    public OrderManager() {
        restaurantOrderHashMap = new HashMap<>();
        internetOrderHashMap = new HashMap<>();
    }

    // Методы класса:
    // − перегрузка метода добавления заказа. В качестве параметров принимает строку – адрес и ссылку на заказ.
    public boolean add(int tableNumber, RestaurantOrder order) throws Exception {
        if (restaurantOrderHashMap.containsKey(tableNumber)) {
            // Исключение OrderAlreadyAddedException
            throw new Exception("OrderAlreadyAddedException");
        } else {
            restaurantOrderHashMap.put(tableNumber, order);
            return true;
        }
    }

    public boolean add(String address, InternetOrder order) {
        try {
            internetOrderHashMap.put(address, order);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    // − возвращающий массив имеющихся на данный момент интернет-заказов.
    // − возвращающий общее среди всех интернет-заказов количество заказанных порций заданного блюда по его имени. Принимает имя блюда в качестве параметра. Методы должны работать с интерфейсными ссылками Order и Item.

    // − перегрузка метода удаления заказа. В качестве параметра принимает строку – адрес заказа.
    public void removeInternetOrder(String address) {
        internetOrderHashMap.remove(address);
    }

    public void removeRestaurantOrder(int tableNumber) {
        restaurantOrderHashMap.remove(tableNumber);
    }

    // − перегрузка метода получения заказа. В качестве параметра принимает строку – адрес.
    public InternetOrder getInternetOrder(String address) {
        return internetOrderHashMap.get(address);
    }

    public RestaurantOrder getRestaurantOrder(int tableNumber) {
        return restaurantOrderHashMap.get(tableNumber);
    }

    // − возвращающий суммарную сумму имеющихся на данный момент интернет-заказов.
    public double InternetOrdersCostSummary() {
        double total = 0;
        for (String key : internetOrderHashMap.keySet()) {
            total += internetOrderHashMap.get(key).priceTotal();
        }
        return total;
    }

    public double RestaurantOrdersCostSummary() {
        double total = 0;
        for (int key : restaurantOrderHashMap.keySet()) {
            total += restaurantOrderHashMap.get(key).priceTotal();
        }
        return total;
    }

    // − перегрузка метода добавления позиции к заказу. В качестве параметра принимает адрес и Item.
    public void addDishInternetOrder(String address, Dish dish) {
        internetOrderHashMap.get(address).add(dish);
    }

    public void addDrinkInternetOrder(String address, Drink drink) {
        internetOrderHashMap.get(address).add(drink);
    }

    public void addDishRestaurantOrder(int tableNumber, Dish dish) {
        restaurantOrderHashMap.get(tableNumber).add(dish);
    }

    public void addDrinkRestaurantOrder(int tableNumber, Drink drink) {
        restaurantOrderHashMap.get(tableNumber).add(drink);
    }

    public String getAllOrders() {
        StringBuilder s = new StringBuilder();
        if (!restaurantOrderHashMap.isEmpty()) {
            s.append("Заказы в ресторане:\n");
            for (int key : restaurantOrderHashMap.keySet()) {
                s.append("Заказ на столик №").append(key).append(" на сумму : ").append(restaurantOrderHashMap.get(key).priceTotal()).append("\n");
            }
        }
        if (!internetOrderHashMap.isEmpty()) {
            s.append("Заказы через интернете:\n");
            for (String key : internetOrderHashMap.keySet()) {
                s.append("Заказ на адрес: ").append(key).append(" на сумму : ").append(internetOrderHashMap.get(key).priceTotal()).append("\n");
            }
        }
        return s.toString();
    }
}
