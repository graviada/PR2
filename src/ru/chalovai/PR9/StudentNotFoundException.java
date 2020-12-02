package ru.chalovai.PR9;

// Класс исключения

public class StudentNotFoundException extends Exception {
    // Создает новое исключение с указанным подробным сообщением
    public StudentNotFoundException(String message) {
        // Вызывается конструктор с одним аргументом из суперкласса (родительского класса) Exception
        super(message);
    }
}
