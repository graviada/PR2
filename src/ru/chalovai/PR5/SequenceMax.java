package ru.chalovai.PR5;

import java.util.Scanner;

public class SequenceMax {
    public static int rec_17 () {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n == 0) { // Окончание ввода
            return 0;
        }
        else {
            return Math.max(n, rec_17()); // Сравниваем полученное число со следующим
        }
    }
    public static void main(String[] args) {
        System.out.println(rec_17());
    }
}
