package ru.chalovai.PR3.practice1;

public class Square extends Rectangle {
    public Square(){
        this.width = 1;
        this.length = 1;
    }

    public Square(double side){
        this.width = side;
        this.length = side;
    }

    public Square(double side, String color, boolean filled){
        this.length = side;
        this.width = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide(){
        return this.length;
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    public void setSide(double side) {
        this.length = side;
        this.width = side;
    }

    @Override
    public String toString() {
        return "Shape: Square, " +
                "side = "+ length +
                ", color = " + color +
                ", filled = " + filled;
    }
}
