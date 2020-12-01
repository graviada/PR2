package ru.chalovai.PR9;

// Класс исключения

public class StudentNotFoundException extends Exception {
    public StudentNotFoundException(String message) {
        // Создает новое исключение с указанным подробным сообщением
        // Вызывается конструктор с одним аргументом из суперкласса (родительского класса) Exception
        super(message);
    }
}
