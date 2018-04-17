package com.nyuf2014.s03thehackerati.shapes;

public class Square extends Shape {
    public double side;

    public Square(double r) {
        side = r;
    }

    public double area() {
        return Math.pow(side, 2.0);
    }
}
