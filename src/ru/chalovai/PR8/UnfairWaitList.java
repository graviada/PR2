package ru.chalovai.PR8;

import java.util.Collection;

public class UnfairWaitList<E> extends WaitList<E> implements IWaitList<E>{
    @Override
    public void add(E element) {
        super.add(element);
    }

    public void remove(E e) {
        int i = 0;
        boolean flag = false;
        for (E k : content) {
            if (!flag && k.equals(e) && i != 0) {
                content.remove(k);
                flag = true;
            }
            i++;
        }
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

    public void moveToBack() {
        content.add(content.remove());
    }
}