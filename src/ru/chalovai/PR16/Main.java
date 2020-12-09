package ru.chalovai.PR16;

// Создайте не объявляемое исключение IllegalTableNumber, выбрасываемое в методах, принимающих номер столика в качестве параметра, если столика с таким номером не существует.

public class Main {
    public static void main(String[] ar) {
        OrderManager orderManager = new OrderManager();
        RestaurantOrder restaurantOrder = new RestaurantOrder();
        InternetOrder internetOrder = new InternetOrder();

        try {
            Drink cap = new Drink("Сок", "яблочный", 60);
            Drink wine = new Drink("Красное вино", "0.7", 450);
            Drink coffee = new Drink("Каппучино", "0.3", 80);
            Dish roast = new Dish("Ростбиф", "с картошкой", 180);
            Dish dumplings = new Dish("Салат Цезарь", "с курицей, зеленым салатом, помидорами и специальным соусом, подается с гренками", 150);
            Dish smoothie = new Dish("Медовик", "торт на медовой основе", 120);

            System.out.println("Вы выбрали:");
            System.out.println(cap.toString());
            System.out.println(wine.toString());
            System.out.println(coffee.toString());
            System.out.println(roast.toString());
            System.out.println(dumplings.toString());
            System.out.println(smoothie.toString());

            // Добавить в заказ в ресторане
            restaurantOrder.add(cap);
            restaurantOrder.add(coffee);
            restaurantOrder.add(dumplings);
            restaurantOrder.add(dumplings);
            restaurantOrder.add(roast);

            // Добавить в заказ в интернете
            internetOrder.add(roast);
            internetOrder.add(wine);
            internetOrder.add(smoothie);

            orderManager.add(1, restaurantOrder);
            orderManager.add(2, restaurantOrder);
            orderManager.add("Moscow", internetOrder);

            System.out.print("Суммарная стоимость заказа в ресторане на один столик: ");
            System.out.println(restaurantOrder.priceTotal());

            System.out.print("Суммарная стоимость заказа в ресторане на все столики (два): ");
            System.out.println(orderManager.RestaurantOrdersCostSummary());

            System.out.print("Количество блюд в заказе (ресторан): ");
            System.out.println(restaurantOrder.dishQuantity());

            System.out.print("Количество блюд \"Салат Цезарь\" в заказе (ресторан): ");
            System.out.println(restaurantOrder.dishQuantity("Салат Цезарь"));

            System.out.print("Количество позиций в заказе (интернет): ");
            System.out.println(internetOrder.getCount());

            System.out.print("Суммарная стоимость заказа в интернете: ");
            System.out.println(internetOrder.priceTotal());

            // Удаляем Салат Цезарь
            internetOrder.remove("Салат Цезарь");

            System.out.print("Суммарная стоимость заказа в ресторане на все столики (два): ");
            System.out.println(restaurantOrder.priceTotal());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
