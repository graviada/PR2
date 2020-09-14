package ru.chalovai.PR4.example6;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyMouse extends JFrame
{
    JLabel lbl = new JLabel("");

    public MyMouse()
    {
        super("Dude! Where's my mouse ?");
        setSize(400,400);
        setLayout(new BorderLayout());
        add(lbl,BorderLayout.SOUTH);

        addMouseListener(new MouseListener()
        {
            // Вызывается, когда мышь выходит из области компонента.
            public void mouseExited(MouseEvent a){}

            // Вызывается, когда кнопка мыши была нажата (нажата и отпущена) на
            // области компонента
            public void mouseClicked(MouseEvent a)
            {lbl.setText("X="+a.getX()+" Y="+a.getY());}

            // Вызывается, когда мышь входит в область компонент.
            public void mouseEntered(MouseEvent a) {}

            // Вызывается, когда над областью компонента отпущена кнопка мыши.
            public void mouseReleased(MouseEvent a) {}

            // Вызывается при нажатии кнопки мыши на область компонента.
            public void mousePressed(MouseEvent a) {}
        });
    }
    public static void main(String[]args)
    {
        new MyMouse().setVisible(true);
    }
}
