package ru.chalovai.PR3.practice2;

public class MovableCircle extends MovablePoint implements Movable {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int radius, int xSpeed, int ySpeed) {
        super(0,0,0,0); // Вызов конструктора суперкласса (родительского класса)
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() {
        center.y += ySpeed;
    }

    @Override
    public void moveRight() {
        center.x += xSpeed;
    }

    @Override
    public void moveLeft() {
        center.x -= xSpeed;
    }

    @Override
    public void moveDown() {
        center.y -= ySpeed;
    }

    @Override
    public String toString() {
        return "MovableCircle {" +
                "radius = " + radius +
                ", center = " + center +
                '}';
    }
}