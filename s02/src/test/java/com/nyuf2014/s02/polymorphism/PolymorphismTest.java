package com.nyuf2014.s02.polymorphism;

import java.util.ArrayList;

/**
 * Created by callas on 9/16/2014.
 */
public class PolymorphismTest {

    public static void main(String[] args) {
        // write your code here
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        Shape aCircle = new Circle(2.0);
        shapes.add(aCircle);
        Shape aSquare = new Square(2.0);
        shapes.add(aSquare);
        Shape aRTriangle = new RTriangle(2.0,2.0);
        shapes.add(aRTriangle);

        for (Shape ss: shapes) {
            System.out.println(ss);
        }
    }


}
