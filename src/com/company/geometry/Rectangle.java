package com.company.geometry;

public class Rectangle {
    public double width, height;
    private Point point;

    public Rectangle(double x, double y) {
        this.width = x;
        this.height = y;
    }

    public void setPosition(Point point) {
        this.point = point;
    }


    public Point getPosition() {
        return point;
    }

}
