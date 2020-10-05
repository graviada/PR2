package ru.chalovai.PR7;

public class Card {
    protected int value;

    public Card(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Card{" +
                "value=" + value +
                '}';
    }
}
