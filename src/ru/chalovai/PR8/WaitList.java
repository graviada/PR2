package ru.chalovai.PR8;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

public class WaitList<E> implements IWaitList<E> {
    protected ConcurrentLinkedQueue<E> content = new ConcurrentLinkedQueue<>();

    @Override
    public void add(E element) {
        this.content.add(element);
    }

    @Override
    public E remove() {
        return this.content.remove();
    }

    @Override
    public boolean contains(E element) {
        return this.content.contains(element);
    }

    @Override
    public boolean containsAll(Collection<E> c) {
        return this.content.containsAll(c);
    }

    @Override
    public boolean isEmpty() {
        return this.content.isEmpty();
    }

    public WaitList(){

    }

    public WaitList(Collection<E> c){
        this.content.addAll(c);
    }

    @Override
    public String toString() {
        return "WaitList{" +
                "content=" + content +
                '}';
    }
}
