package ru.chalovai.PR4.example1;

import javax.swing.*;
import java.awt.*;

class LabExample1 extends JFrame
{
    // Текстовое поле, библиотека javax.swing.*, можно ввести только одну строку
    JTextField jta = new JTextField(10);
    // Шрифт, библиотека java.awt.*
    Font fnt = new Font("Times new roman",Font.BOLD,20);

    // Конструктор
    LabExample1()
    {
        super("Example");
        // Фиксированное расположение компонент
        // Менеджер последовательного расположение FlowLayout размещает
        // компоненты в контейнере слева направо, сверху вниз
        setLayout(new FlowLayout());
        setSize(250,100);

        // Добавляем текстовое поле
        add(jta);
        // Цвет текста
        jta.setForeground(Color.PINK);
        // Шрифт
        jta.setFont(fnt);

        // Скрывает или показывает текущее о кно в зависимости от параметра в скобках
        setVisible(true);
    }

    public static void main(String[]args)
    {
        new LabExample1();
    }
}
