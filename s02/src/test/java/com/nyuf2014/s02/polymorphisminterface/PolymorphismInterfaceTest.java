package com.nyuf2014.s02.polymorphisminterface;

import java.util.ArrayList;

/**
 * Created by callas on 9/16/2014.
 */
public class PolymorphismInterfaceTest {

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
