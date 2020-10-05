package ru.chalovai.PR5;

public class TriangleSequence {
    public static String rec_1(int n) {
        int sum = 0; // Сумма первых n членов арифметической прогрессии
        int repeatingNum = 0; // Повторяющееся число
        if (n == 1) {
            System.out.print("1");
        } else {
            for (int i = 1; sum < n; i++) {
                sum += i;
                repeatingNum = i;
            }
            System.out.print(rec_1(n-1) + " " + repeatingNum);
        }
        return "";
    }
    public static void main(String[] args) {
        rec_1(6);
    }
}
