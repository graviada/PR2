package ru.chalovai.PR8;

import java.util.Collection;

public class UnfairWaitList<E> extends WaitList<E> implements IWaitList<E>{
    @Override
    public void add(E element) {
        super.add(element);
    }

    @Override
    public E remove() {
        return super.remove();
    }

    //В задании на UML было необходимо создать метод void remove(), но с таким названием происходит
    //конфликт имен, поэтому он переименован в void removeElement()

    public void removeElement(E element){
        content.remove(element);
    }

    @Override
    public boolean contains(E element) {
        return super.contains(element);
    }

    @Override
    public boolean containsAll(Collection<E> c) {
        return super.containsAll(c);
    }

    @Override
    public boolean isEmpty() {
        return super.isEmpty();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    /* Для простоты добавлен параметр в конструктор, т.к. непонятно, какой здесь может быть
    * непараметризованный конструктор*/

    public UnfairWaitList(Collection<E> c){
        super(c);
    }

    public void moveToBack(E element){

    }
}