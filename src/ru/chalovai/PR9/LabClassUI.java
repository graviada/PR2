package ru.chalovai.PR9;

import java.util.Scanner;

public class LabClassUI {
    LabClass labClass;

    public LabClassUI() {
        labClass = new LabClass();
        LabClassDriver driver = new LabClassDriver(labClass);
        driver.createLabClass();
    }

    public void findStudent() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя студента: ");
        String name;

        try {
            name = in.nextLine();
            if (name.isEmpty()) {
                throw new EmptyStringException("Вы ввели пустую строку!");
            }
        }
        catch (EmptyStringException e) {
            System.err.println(e.getMessage());
            System.out.println();
            findStudent();
            return;
        }

        try {
            System.out.println(labClass.find(name).toString());
            System.out.println(labClass.toString());
        }
        catch (StudentNotFoundException e) {
            System.err.println(e.getMessage());
        }
    }
}
