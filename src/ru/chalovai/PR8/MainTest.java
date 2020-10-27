package ru.chalovai.PR8;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

public class MainTest {

    public static void fillQueueWithString(ConcurrentLinkedQueue<String> q){
        for(int i = 0; i < 10; i++){
            q.add("String element " + i);
        }
    }

    public static void main(String []args){
        ConcurrentLinkedQueue<String> queue1 = new ConcurrentLinkedQueue<String>();
        fillQueueWithString(queue1);
        System.out.println(queue1);

        /*
        //===================================ТЕСТ BoundedWaitList=======================================================
        BoundedWaitList<String> bList= new BoundedWaitList(5, queue1);
        System.out.println(bList);
        bList.add("String element 10");
        System.out.println(bList);
        bList.add("String element 11");
        System.out.println(bList);

        bList.remove();
        bList.add("String element 12");
        System.out.println(bList);

        // Проверка наличия элемента
        System.out.println(bList.contains("String element 12"));
        System.out.println(bList.contains("String element 13"));


        System.out.println("");
        System.out.println("");
        */
        //===================================ТЕСТ UnfairWaitList========================================================

        UnfairWaitList<String> uList= new UnfairWaitList(queue1);
        System.out.println(uList);
        uList.add("String element 10");
        System.out.println(uList);
        uList.add("String element 11");
        System.out.println(uList);

        uList.remove();
        uList.add("String element 12");
        System.out.println(uList);

        System.out.println(uList.contains("String element 12"));
        System.out.println(uList.contains("String element 13"));

        uList.removeElement("String element 1");
        uList.removeElement("String element 3");
        uList.removeElement("String element 5");
        uList.removeElement("String element 7");
        uList.removeElement("String element 9");
        uList.removeElement("String element 11");

        System.out.println(uList);

    }
}
