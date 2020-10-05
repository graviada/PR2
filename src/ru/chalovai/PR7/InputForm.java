package ru.chalovai.PR7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Stack;

public class InputForm extends JFrame {
    JLabel lblPl1 = new JLabel("<html> <br>" +
            "Введите колоду игрока 1" +
            " через пробелы (5 карт) <br>)<br></html>");
    JLabel lblPl2 = new JLabel("<html> <br>" +
            "Введите колоду игрока 2" +
            " через пробелы (5 карт) <br>)<br></html>");

    JTextField fieldPl1 = new JTextField();
    JTextField fieldPl2 = new JTextField();

    JButton butOK = new JButton("Подтвердить");
    JButton butCancel = new JButton("Очистить");


    public InputForm(Stack<Card> deckPlayer1, Stack<Card> deckPlayer2){
        super("Enter decks");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2, 10, 10));
        setPreferredSize(new Dimension(400, 200));
        pack();
        setResizable(false);

        lblPl1.setHorizontalAlignment(SwingConstants.CENTER);
        lblPl2.setHorizontalAlignment(SwingConstants.CENTER);
        lblPl1.setFont(new Font("Font1", Font.BOLD, 14));
        lblPl2.setFont(new Font("Font1", Font.BOLD, 14));

        butOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!fieldPl2.getText().isEmpty() && !fieldPl1.getText().isEmpty()) {
                    getStack(fieldPl1.getText(), deckPlayer1);
                    getStack(fieldPl2.getText(), deckPlayer2);
                    setVisible(false);
                    GameList gamelist = new GameList(deckPlayer1, deckPlayer2);
                }
            }
        });
        butCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fieldPl1.setText("");
                fieldPl2.setText("");
            }
        });

        add(lblPl1);
        add(fieldPl1);
        add(lblPl2);
        add(fieldPl2);
        add(butCancel);
        add(butOK);

        setVisible(true);
    }

    private static void getStack(String str, Stack<Card> deck){
        Stack<Card> stack = new Stack<>();

        String[] strArr = str.split(" ");
        for(int i = strArr.length - 1; i > -1; i--){
            deck.push(new Card(Integer.parseInt(strArr[i])));
        }
    }

}
