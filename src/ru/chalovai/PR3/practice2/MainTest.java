package ru.chalovai.PR3.practice2;

public class MainTest {
    public static void main(String []args){
        MovableCircle circle = new MovableCircle(8, 11, 10, 3, 2);
        MovablePoint point = new MovablePoint(9, 24, 4, 8);

        System.out.println(circle);
        System.out.println(point);

        circle.moveDown();
        circle.moveRight();
        point.moveRight();
        point.moveRight();
        point.moveDown();

        System.out.println(circle);
        System.out.println(point);

        MovableRectangle rect = new MovableRectangle(1, 4,3, 1, 4, 2);

        System.out.println(rect);

        rect.moveDown();
        rect.moveRight();

        System.out.println(rect);

        rect.moveLeft();
        rect.moveUp();

        System.out.println(rect);
    }
}
