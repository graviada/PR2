package ru.chalovai.PR3.practice2;

public class MovablePoint implements Movable {
    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.xSpeed = xSpeed;
        this.y = y;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() {
        y += ySpeed;
    }

    @Override
    public void moveRight(){
        x += xSpeed;
    }

    @Override
    public void moveLeft(){
        x -= xSpeed;
    }

    @Override
    public void moveDown(){
        y -= ySpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint {" +
                "x = " + this.x +
                ", y = " + this.y +
                ", xSpeed = " + this.xSpeed +
                ", ySpeed = " + this.ySpeed +
                '}';
    }
}
