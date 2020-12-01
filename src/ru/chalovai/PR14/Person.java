package ru.chalovai.PR14;

public class Person {
    //ФИО - last/first/middle
    private String lastName;
    private String firstName;
    private String middleName;

    public Person(String lastName) {
        this.lastName = lastName;
    }

    public Person(String lastName, String firstName, String middleName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (middleName == null && firstName == null) {
            sb.append(lastName);
        }
        // выделение char или части строки из String (подстрока)
        // char charAt(int index)    // позиция от 0 до  (длина строки-1)
        else {
            sb.append(lastName).append(" ").append(firstName.charAt(0)).append(".").append(middleName.charAt(0)).append(".");
        }
        return sb.toString();
    }

}
