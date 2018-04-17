package com.nyuf2014.s02.polymorphisminterface;

/**
 * Created by computerlab on 9/13/14.
 */
public class Square extends Shape {
    public double side;

    public Square(double r) {
        side = r;
    }

    public double area() {
        return Math.pow(side, 2.0);
    }
}