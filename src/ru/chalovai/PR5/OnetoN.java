package ru.chalovai.PR5;

public class OnetoN {
    public static String rec_2(int n) {
        if (n == 1) {
            return "1";
        }
        return rec_2(n - 1) + " " + n;
    }
    public static void main(String[] args) {
        System.out.println(rec_2(8));
    }
}
