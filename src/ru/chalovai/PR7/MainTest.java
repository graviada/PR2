package ru.chalovai.PR7;

import java.util.Scanner;
import java.util.Stack;

public class MainTest {

    private static Scanner in = new Scanner(System.in);

    public static void createDeck(Stack<Card> deck){
        for (int i = 0; i < 5; i++){
            deck.push(new Card(in.nextInt()));
        }
    }

    public static void printStack(Stack<Card> deck){
        for (int i = 0; i < deck.size(); i++){
            System.out.println(deck.elementAt(i));
        }
        System.out.println("");
    }


    public static void main(String []args){
        //создаем колоду с клавиатуры
        Stack<Card> firstDeck = new Stack<>();
        Stack<Card> secondDeck = new Stack<>();
//        createDeck(firstDeck);
//        createDeck(secondDeck);
//
//        printStack(firstDeck);
//        printStack(secondDeck);
//
//        GameController.takeCards(firstDeck, secondDeck);

        //Input form
        InputForm inputForm = new InputForm(firstDeck, secondDeck);

    }
}