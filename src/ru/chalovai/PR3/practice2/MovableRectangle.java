package ru.chalovai.PR3.practice2;

public class MovableRectangle extends MovablePoint {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int x2, int y1, int y2, int xSpeed, int ySpeed){
        super(1,1,1,1); // Вызов конструктора суперкласса (родительского класса)
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }
// Метод для проверки того, что точки имеют одну и ту же скорость
    private boolean isEqual(MovablePoint tl, MovablePoint br){
        boolean flag = false;
        if (tl.ySpeed == br.ySpeed && tl.xSpeed == br.xSpeed)
            flag = true;
        return flag;
    }

    @Override
    public void moveUp() {
        if(isEqual(topLeft, bottomRight)) {
            topLeft.y += topLeft.ySpeed;
            bottomRight.y += bottomRight.ySpeed;
        }
    }

    @Override
    public void moveDown() {
        if(isEqual(topLeft, bottomRight)) {
            topLeft.y -= topLeft.ySpeed;
            bottomRight.y -= bottomRight.ySpeed;
        }
    }

    @Override
    public void moveLeft() {
        if(isEqual(topLeft, bottomRight)) {
            topLeft.x -= topLeft.xSpeed;
            bottomRight.x -= bottomRight.xSpeed;
        }
    }

    @Override
    public void moveRight() {
        if(isEqual(topLeft, bottomRight)) {
            topLeft.x += topLeft.xSpeed;
            bottomRight.x += bottomRight.xSpeed;
        }
    }

    @Override
    public String toString() {
        return "MovableRectangle {" +
                "topLeft = " + topLeft +
                ", bottomRight = " + bottomRight +
                '}';
    }
}
