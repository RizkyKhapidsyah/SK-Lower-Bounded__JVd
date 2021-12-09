
package com.rk;


public class Rectangle extends Shape {
    private double h;
    private double w;

    public Rectangle(double height, double width) {
        h = height;
        w = width;
    }

    @Override
    public double getArea() {
        return h * w;
    }

}
