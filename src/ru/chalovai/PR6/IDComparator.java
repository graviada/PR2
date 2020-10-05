package ru.chalovai.PR6;

public class IDComparator extends Student implements Comparator{

    //сравнивание студентов по их id
    @Override
    public int compareTo(Student ob) {
        if(this.id < ob.id)
            return -1;
        else if(this.id > ob.id)
            return 1;
        else
            return 0;
    }
}
