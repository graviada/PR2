package ru.chalovai.PR6;

public class MainTest {

    public static void printList(Student[] list){
        for (int i = 0; i < list.length; i++)
            System.out.println(list[i]);
        System.out.println("");
    }

    public static void createIdList(Student[] list){
        for (int i = 0; i < list.length; i++)
            list[i] = new IDComparator();
    }

    public static void createMarkList(Student[] list){
        for (int i = 0; i < list.length; i++)
            list[i] = new MarkComparator();
    }

    public static void main(String []args){
        Student []studentList = new Student[10];

        //Создадим и отсортируем массив студентов по их ID сортировкой вставками
        createIdList(studentList);
        System.out.println("Исходный список:");
        printList(studentList);
        Sorter.insertionSort(studentList);
        System.out.println("Сортировка вставками списка по ID студента:");
        printList(studentList);

        //Создадим и отсортируем массив студентов по их оценке быстрой сортировкой
        createMarkList(studentList);
        System.out.println("Из исходных данных сформируем список оценок:");
        printList(studentList);

        Sorter.quickSort(studentList, 0, studentList.length - 1);
        System.out.println("Быстрая сортировка по оценке студента:");
        printList(studentList);

        //Создадим два массива студентов, отсортируем их по их ID и сольем в один сортировкой слиянием
        Student []studentList1 = new Student[10];
        Student []studentList2 = new Student[10];
        createIdList(studentList1);
        createIdList(studentList2);

        System.out.println("Первый список:");
        printList(studentList1);

        System.out.println("Второй список:");
        printList(studentList2);
        //Отсортируем оба массива
        Sorter.mergeSort(studentList1, 0, studentList.length - 1);
        Sorter.mergeSort(studentList2, 0, studentList.length - 1);
        //printList(studentList1);
        //printList(studentList2);
        //Сольем отсортированные массивы в один
        Student []studentList3 = Sorter.mergeLists(studentList1, studentList2);
        System.out.println("Отсортированные с помощью слияния (mergeSort) списки слиты в один (по ID):");
        printList(studentList3);
    }
}
