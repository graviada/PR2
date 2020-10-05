package ru.chalovai.PR7;

import java.util.Stack;

public class GameController {

    public static boolean isBigger(Stack<Card> deckPlayer1, Stack<Card> deckPlayer2){
        if ((deckPlayer1.peek().getValue() > deckPlayer2.peek().getValue() && !(deckPlayer1.peek().getValue() == 9 && deckPlayer2.peek().getValue() == 0))|| (deckPlayer1.peek().getValue() == 0 && deckPlayer2.peek().getValue() == 9))
            return true;
        else if((deckPlayer1.peek().getValue() < deckPlayer2.peek().getValue() && ! (deckPlayer2.peek().getValue() == 9 && deckPlayer1.peek().getValue() == 0))|| (deckPlayer2.peek().getValue() == 0 && deckPlayer1.peek().getValue() == 9))
            return false;
        return false;
    }

    public static String takeCards(Stack<Card> deckPlayer1, Stack<Card> deckPlayer2) {
        int move = 0;
        while (true) {

            if (deckPlayer1.isEmpty())
                return ("Second player won on the " + move + " move!");
            else if (deckPlayer2.isEmpty())
                return ("First player won on the " + move + " move!");
            else if (move >= 106)
                return ("DRAW on the " + move + " move!");

            if (isBigger(deckPlayer1, deckPlayer2)) {
                deckPlayer1.insertElementAt(deckPlayer1.pop(), 0);
                deckPlayer1.insertElementAt(deckPlayer2.pop(), 0);
            } else {
                deckPlayer2.insertElementAt(deckPlayer1.pop(), 0);
                deckPlayer2.insertElementAt(deckPlayer2.pop(), 0);
            }
            move++;
        }
    }
}
