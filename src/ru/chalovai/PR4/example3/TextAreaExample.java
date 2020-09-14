package ru.chalovai.PR4.example3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class TextAreaExample extends JFrame
{
    JTextArea jta1 = new JTextArea(10,25);
    JButton button = new JButton("Add some Text");
    JTextArea txtArea = new JTextArea(20,20);
    JScrollPane jScroll = new JScrollPane(txtArea);

    public TextAreaExample()
    {
        super("Example");
        setSize(300,300);
        setLayout(new FlowLayout());
        add(jta1);
        add(button);

        button.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                String txt = JOptionPane.showInputDialog(null,"Insert " +
                        "some text");
                        jta1.append(txt);
            }
        });

        add(jScroll); // we add the scrollPane and not the text area.
    }
    public static void main(String[]args)
    {
        new TextAreaExample().setVisible(true);
    }
}
