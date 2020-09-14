package ru.chalovai.PR4.example5;

import javax.swing.*;

class NullLayout extends JFrame
{
    JButton but1 = new JButton("One");
    JButton but2 = new JButton("two");
    JButton but3 = new JButton("three");

    public NullLayout()
    {
        //?? В чем разница между setBounds, setLocation и setSize?

        setLayout(null);
        // Вы можете использовать setBounds(x, y, width, height), чтобы указать положение
        // и размер компонента GUI, если вы установите layout на null. Тогда (x, y)
        // является координатой верхнего левого угла этой компоненты.
        but1.setBounds(150,300,100,20); // added at 150,300 width = 100, height=20

        // Изменяет размер этого экземпляра стека до размера, передаваемого в качестве
        // параметра.
        but2.setSize(80,400); // added at 0,0 width = 80, height=400

        // Методы setLocation() и setBounds() устанавливают положение фрейма.
        but3.setLocation(300,100);
        but3.setSize(200,75);

// those two steps can be combined in one setBounds method call
        add(but1);
        add(but2);
        add(but3);
        setSize(500,500);
    }

    public static void main(String[]args)
    {
        new NullLayout().setVisible(true);
    }
}
