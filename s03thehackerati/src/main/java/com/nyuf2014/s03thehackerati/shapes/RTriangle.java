package com.nyuf2014.s03thehackerati.shapes;

public class RTriangle extends Shape {
    public double base;
    public double height;

    public RTriangle(double b, double h) {
        base = b;
        height = h;
    }

    public double area() {
        return ( ( (base * height ) / 2) );
    }
}
