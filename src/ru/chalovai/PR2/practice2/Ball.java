package ru.chalovai.PR2.practice2;

public class Ball {
    private double x = 0.0, y = 0.0;

    public Ball (double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Ball () {}

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x, double y) {
        setX(this.x);
        setX(this.y);
    }

    public void move(double xDisp, double yDisp) {
        x += xDisp;
        y += yDisp;
    }

    @Override
    public String toString() {
        return "Ball " +
                "x=" + x +
                ", y=" + y;
    }
}
