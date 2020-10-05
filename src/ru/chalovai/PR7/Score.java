package ru.chalovai.PR7;

import javax.swing.*;
import java.awt.*;

public class Score extends JFrame {

    JLabel winner = new JLabel();

    public Score(String str){
        super("Result");
        setSize(150, 40);
        setResizable(false);

        setLayout(new FlowLayout(FlowLayout.CENTER));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        winner.setText(str);
        winner.setFont(new Font("ft", Font.BOLD, 20));
        add(winner);

        pack();

        setVisible(true);
    }
}
