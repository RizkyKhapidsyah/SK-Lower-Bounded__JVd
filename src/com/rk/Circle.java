
package com.rk;

public class Circle extends Shape {
    private double r;

    public Circle(double radius) {
        r = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * r * r;
    }
}
