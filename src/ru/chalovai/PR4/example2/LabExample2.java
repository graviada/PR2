package ru.chalovai.PR4.example2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class LabExample2 extends JFrame
{
    JTextField jta1 = new JTextField(10);
    JTextField jta2 = new JTextField(10);
    JButton button = new JButton(" Add them up");
    Font fnt = new Font("Times new roman",Font.BOLD,20);

    LabExample2()
    {
        super("Example");
        setLayout(new FlowLayout());
        setSize(250,150);

        // С помощью JLabel можно показать текст с иконкой. Если нужен какой-то компонент,
        // чтобы отобразить какое-то сообщение пользователю или сделать для поля ввода
        // текстовую метку, или показать иконку — используем JLabel.
        add(new JLabel("1st Number"));
        add(jta1);
        add(new JLabel("2nd Number"));
        add(jta2);
        add(button);

        button.addActionListener(new ActionListener()
        {
            // Функция обработки события (пользователь проводить манипуляции с мышью)
            public void actionPerformed(ActionEvent ae)
            {
                try
                {
                    // Метод parseDouble () класса Java Double — это встроенный метод в
                    // Java, который возвращает новый тип double, инициализированный
                    // значением, представленным указанной строкой, как это делается
                    // методом valueOf класса Double
                    double x1 =
                            Double.parseDouble(jta1.getText().trim());
                    double x2 =
                            Double.parseDouble(jta2.getText().trim());

                    // ??
                    // Начальная строка с параметрами:
                    //JOptionPane.showMessageDialog(null, "Result = ", + (x1 + x2),"Alert", JOptionPane.INFORMATION_MESSAGE);
                    // Но компилятор выдает ошибку на + (x1 + x2)
                    JOptionPane.showMessageDialog(null, "Result = ","Alert", JOptionPane.INFORMATION_MESSAGE);
                }
                catch(Exception e)
                {
                    // Диалоговое окно вывода сообщения
                    JOptionPane.showMessageDialog(null, "Error in Numbers!","Alert" , JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        setVisible(true);
    }
    public static void main(String[]args)
    {
        new LabExample2();
    }
}