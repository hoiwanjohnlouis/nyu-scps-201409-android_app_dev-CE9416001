package com.nyuf2014.s02.polymorphism;

/**
 * Created by computerlab on 9/13/14.
 */
public class RTriangle extends Shape {
    public double base;
    public double height;

    public RTriangle(double b, double h) {
        base = b;
        height = h;
    }

    public double area() {
        return 0.5 * base * height;
    }
}