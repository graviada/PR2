package ru.chalovai.PR8;

import java.util.Collection;

public class BoundedWaitList<E> extends WaitList<E>{
    private int capacity;

    @Override
    public void add(E element) {
        if(this.content.size() < capacity)
            super.add(element);
    }

    @Override
    public E remove() {
        return super.remove();
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
        return "BoundedWaitList{" +
                "capacity=" + capacity +
                ", content=" + content +
                '}';
    }

    public BoundedWaitList(int capacity, Collection<E> c){
        super(c);
        this.capacity = capacity;
        if(this.capacity < this.content.size()){
            System.out.println("WARNING! ERROR<BoundedList:Collection's size exceeds the specified capacity>");
            while(this.content.size() > this.capacity) {
                this.content.remove();
            }
        }
    }

    public int getCapacity() {
        return capacity;
    }
}
