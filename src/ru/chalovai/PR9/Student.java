package ru.chalovai.PR9;

// При применении интерфейса Comparable<E> он типизируется текущим классом.
// Интерфейс Comparable содержит один единственный метод int compareTo(E item),
// который сравнивает текущий объект с объектом, переданным в качестве параметра.
// Если этот метод возвращает отрицательное число, то текущий объект будет располагаться перед тем,
// который передается через параметр. Если метод вернет положительное число, то, наоборот, после
// второго объекта. Если метод возвратит ноль, значит, оба объекта равны.

class Student implements Comparable<Student> {
    private final String name;
    private final int mark;

    @Override
    public int compareTo(Student ob) {
        // compare
        // Сравнивает два значения int численно
        // Значение 0, если x == y; значение меньше 0, если x < y; и значение больше 0, если x > y
        return Integer.compare(this.mark, ob.getGrade());
    }

    public Student(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }

    public int getGrade() {
        return mark;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Студент " + name +
                ", оценка " + mark;
    }
}
