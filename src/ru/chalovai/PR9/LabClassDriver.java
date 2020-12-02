package ru.chalovai.PR9;

// Scanner — это класс в пакете java.util, используемый для получения ввода примитивных типов с консоли,
// таких как int, double и т. Д., а также строк.
import java.util.Scanner;

public class LabClassDriver {
    LabClass labClass;

    LabClassDriver(LabClass labClass) {
        this.labClass = labClass;
    }

    public void createLabClass() {
        System.out.print("Введите имя и оценку студента, чтобы добавить его ('-' - выйти из цикла): ");
        String name;
        int mark;
        Scanner in = new Scanner(System.in);
        do {
            name = (in.next());
            if (!name.equals("-")) {
                mark = in.nextInt();
                labClass.add(new Student(name, mark));
            }
        } while (!name.equals("-"));
    }
}
