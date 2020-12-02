package ru.chalovai.PR9;

// ArrayList — реализация изменяемого массива интерфейса List, часть Collection Framework,
// который отвечает за список (или динамический массив), расположенный в пакете java.utils.
import java.util.ArrayList;

public class LabClass {

    // Всякий раз, когда ключевое слово final в Java используется с переменной, полем или параметром,
    // это означает, что после передачи ссылки или создания экземпляра его значение не может быть
    // изменено во время выполнения программы. Если переменная без какого-либо значения была объявлена
    // как final, тогда она называется пустой / неинициализированной конечной переменной и может быть
    // инициализирована только через конструктор.
    private final ArrayList<Student> listOfStudents;
    Student requiredStudent = null;

    public LabClass() {
        this.listOfStudents = new ArrayList<>();
    }

    public void add(Student student) {
        listOfStudents.add(student);
        listOfStudents.sort(Student::compareTo);
    }

    public Student find(String name) throws StudentNotFoundException {

        listOfStudents.forEach(student -> {
            if (student.getName().equals(name))
                requiredStudent = student;
        });

        if (requiredStudent == null) {
            throw new StudentNotFoundException("Студент " + name + " не найден!");
        }

        return requiredStudent;
    }

    public Student remove() {
        return listOfStudents.remove(0);
    }

    public boolean isEmpty() {
        return listOfStudents.isEmpty();
    }
}
