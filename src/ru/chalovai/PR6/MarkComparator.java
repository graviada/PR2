package ru.chalovai.PR6;

public class MarkComparator extends Student implements Comparator {

    // Сравнение студентов по их оценке
    @Override
    public int compareTo(Student ob) {
        if(this.mark < ob.mark)
            return -1;
        else if(this.mark > ob.mark)
            return 1;
        else
            return 0;
    }
}
