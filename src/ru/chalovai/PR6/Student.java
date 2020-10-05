package ru.chalovai.PR6;

public class Student implements Comparator{
    protected int mark;
    protected int id;

    public Student(){
        this.mark = 2 + (int)(Math.random() * 4);
        this.id = 100 + (int)(Math.random() * 999);
    }

    @Override
    public int compareTo(Student ob) {
        return 0;
    }

    @Override
    public String toString() {
        return "Student, " +
                "mark = " + mark
                + ", id = " + id +'.';
    }
}
