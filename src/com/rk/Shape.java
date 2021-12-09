
package com.rk;

public abstract class Shape {

    @Override
    public String toString() {
        return String.valueOf(getArea());
    }

    public abstract double getArea();
}
