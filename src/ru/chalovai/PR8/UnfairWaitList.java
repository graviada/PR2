package ru.chalovai.PR8;

import java.util.Collection;

public class UnfairWaitList<E> extends WaitList<E>  implements IWaitList<E>{
    @Override
    public void add(E element) {
        super.add(element);
    }

    @Override
    public E remove() {
        return super.remove();
    }

    //
    //В задании на UML было необходимо создать метод void remove(), но с таким названием происходит
    //конфликт имен. Поэтому я решил переименовать его в void removeElement()
    //

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

    public UnfairWaitList(Collection<E> c){ //для простоты добавил параметр в конструктор,
        super(c);             // т.к. не понял, какой здесь может быть
    }                        // непараметризованный конструктор

    public void moveToBack(E element){

    }
}