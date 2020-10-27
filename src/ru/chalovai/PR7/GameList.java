package ru.chalovai.PR7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

public class GameList extends JFrame {
    JPanel[] pnl = new JPanel[3];
    JButton butPlay = new JButton("Play!");
    Font fnt1 = new Font("fnt1", Font.BOLD, 20);
    JLabel lblPl1 = new JLabel("Игрок 1");
    JLabel lblPl2 = new JLabel("Игрок 2");

    private static void setGrid(JPanel pnl, Stack<Card> deck){
        for (int i = 4; i > -1; i--) {
            pnl.add(new JLabel(deck.elementAt(i).toString()));
        }
    }

    public GameList(Stack<Card> deckPlayer1, Stack<Card> deckPlayer2){
        super("Game");
        setDefaultCloseOperation( EXIT_ON_CLOSE );
        setSize(230, 230);
        setLocation(100, 100);

        setResizable(false);

        lblPl1.setFont(fnt1);
        lblPl1.setHorizontalAlignment(SwingConstants.CENTER);
        lblPl2.setFont(fnt1);
        lblPl2.setHorizontalAlignment(SwingConstants.CENTER);

        for (int i = 0; i < pnl.length; i++) {
            pnl[i] = new JPanel();
        }

        pnl[0].setLayout(new GridLayout(6, 1));
        pnl[0].add(lblPl1);
        setGrid(pnl[0], deckPlayer1);
        pnl[1].setLayout(new GridLayout(6, 1));
        pnl[1].add(lblPl2);
        setGrid(pnl[1], deckPlayer2);

        JPanel grid = new JPanel(new GridLayout(1, 2, 30, 10) );
        grid.add (pnl[0]);
        grid.add (pnl[1]);
        JPanel flow = new JPanel(new FlowLayout(FlowLayout.LEADING));
        flow.add(grid);
        Container container = getContentPane();
        container.add(flow, BorderLayout.CENTER);
        container.add(butPlay, BorderLayout.SOUTH);

        butPlay.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String st = new String();
                st = GameController.takeCards(deckPlayer1, deckPlayer2);
                setVisible(false);
                Score score = new Score(st);
            }
        });

        setVisible(true);
    }
}
