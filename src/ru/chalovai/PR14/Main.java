package ru.chalovai.PR14;

public class Main {

    public static void main(String[] args) {
        //№1 - Разработать класс Person, в котором имеется функция, возвращающая Фамилию И.О
        System.out.println(new Person("Чалова", "Ирина", "Леонидовна"));

        //№2 - Доработать класс адреса, который из полученной строки выбирает соответствующие части и записывает их в соответствующие поля класса


        //№3 - Реализуйте класс Shirt: Метод toString() выводит объяснение и значение полей построчно.
        String[] shirts = new String[11];
        shirts[0] = "S001,Black Polo Shirt,Black,XL"; shirts[1] = "S002,Black Polo Shirt,Black,L";
        shirts[2] = "S003,Blue Polo Shirt,Blue,XL"; shirts[3] = "S004,Blue Polo Shirt,Blue,M";
        shirts[4] = "S005,Tan Polo Shirt,Tan,XL"; shirts[5] = "S006,Black T-Shirt,Black,XL";
        shirts[6] = "S007,White T-Shirt,White,XL"; shirts[7] = "S008,White T-Shirt,White,L";
        shirts[8] = "S009,Green T-Shirt,Green,S"; shirts[9] = "S010,Orange T-Shirt,Orange,S";
        shirts[10] = "S011,Maroon Polo Shirt,Maroon,S";
        Shirt[] new_shirts = new Shirt[11];
        for (int i = 0; i < shirts.length; i++) {
            new_shirts[i] = new Shirt(shirts[i]);
            System.out.println(new_shirts[i]);
        }

        //№4 - Разработайте класс, который получает строковое представление телефонного номера
        String russianNumber = "89175655655";
        Telephone russianTelephone = new Telephone(russianNumber);
        System.out.println(russianTelephone);
        String otherNumber = "+104289652211";
        Telephone otherTelephone = new Telephone(otherNumber);
        System.out.println(otherTelephone);
        String notrussianNumber_a = "+233241873020";
        Telephone otherTelephone_a = new Telephone(notrussianNumber_a);
        System.out.println(otherTelephone_a);
    }

}

