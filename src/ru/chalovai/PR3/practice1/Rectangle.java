package ru.chalovai.PR3.practice1;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle() {
        this.length = 1;
        this.width = 1;
    }

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        this.length = length;
        this.width = width;
        this.color = color;
        this.filled = filled;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea(){
        return width * length;
    }

    public double getPerimeter(){
        return (width + length) * 2;
    }

    @Override
    public String toString() {
        return "Shape: Rectangle, " +
                " width = " + width +
                ", length = "+ length +
                ", color = " + color +
                ", filled = " + filled;
    }
}
