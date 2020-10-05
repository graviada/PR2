package ru.chalovai.PR5;

public class WithoutTwoZeros {
    public static int rec_9(int a, int b) {
        if (a > b + 1) { // Если количество нулей превосходит количество единиц +1, то возвращаем 0
            return 0;
        }
        if (a == 0 || b == 0) { // Например, 101 или 010
            return 1;
        }
        return rec_9(a, b - 1) + rec_9(a - 1, b - 1);
    }
    public static void main(String[] args) {
        System.out.println(rec_9(2, 2));
    }
}
