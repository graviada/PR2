package ru.chalovai.PR4.practice1;

import javax.swing.*;
import java.awt.*;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class MatchResultsTable extends JFrame
{
    // Смотреть example4
    JPanel[] pnl = new JPanel[3];

    JButton butMadrid = new JButton("Real Madrid");
    JButton butMilan = new JButton("AC Milan");

    JLabel lblResult = new JLabel("RESULT: 0:0");
    Label lblWinner = new Label("WINNER: DRAW"); // Draw - ничья
    JLabel lblLastScore = new JLabel("LAST GOAL: N/A" );

    private int milanScore = 0;
    private int madridScore = 0;

    private void setScore(String team)
    {
        if(team == "Madrid") {
            madridScore++;
            lblLastScore.setText("LAST GOAL: Real Madrid");
        }
        else {
            milanScore++;
            lblLastScore.setText("LAST GOAL: AC Milan");
        }

        lblResult.setText("RESULT: " + madridScore + ":" + milanScore);

        if(madridScore > milanScore)
            lblWinner.setText("WINNER: Real Madrid");
        else if(madridScore < milanScore)
            lblWinner.setText("WINNER: AC Milan");
        else
            lblWinner.setText("WINNER: DRAW");
    }

    public MatchResultsTable()
    {
        // Операция закрытия. Выход из приложения с помощью метода System exit.
        // Используется только в приложениях
        setDefaultCloseOperation( EXIT_ON_CLOSE );
        setLayout(new GridLayout(3,1));

        //Образец цикла смотреть в example4
        for(int i = 0 ; i < pnl.length; i++)
        {
            pnl[i] = new JPanel();

            int r = (int) (Math.random() * 255);
            int b = (int) (Math.random() * 255);
            int g = (int) (Math.random() * 255);

            pnl[i].setBackground(new Color(r,g,b));
            add(pnl[i]);
        }

        pnl[0].setLayout(new GridLayout(1,3, 10, 10));

        lblResult.setHorizontalAlignment(SwingConstants.CENTER);

        butMadrid.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                setScore("Madrid");
            }
        });

        pnl[0].add(butMadrid);

        lblResult.setFont(new Font("Courier New", Font.BOLD, 20));
        lblResult.setForeground(Color.BLACK);
        pnl[0].add(lblResult);

        butMilan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setScore("Milan");
            }
        });

        pnl[0].add(butMilan);

        pnl[1].setLayout(new FlowLayout());
        lblLastScore.setFont(new Font("Courier New", Font.BOLD, 20));
        lblLastScore.setForeground(Color.BLACK);
        pnl[1].add(lblLastScore);

        pnl[2].setLayout(new FlowLayout());
        lblWinner.setFont(new Font("Courier New", Font.BOLD, 20));
        lblWinner.setForeground(Color.BLACK);
        pnl[2].add(lblWinner);

        setSize(450,200);
    }

    public static void main(String[]args)
    {
        new MatchResultsTable().setVisible(true);
    }
}
