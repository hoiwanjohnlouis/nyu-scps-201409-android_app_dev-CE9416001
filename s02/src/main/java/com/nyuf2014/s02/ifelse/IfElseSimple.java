package com.nyuf2014.s02.ifelse;

/**
 * Created by callas on 9/16/2014.
 */
public class IfElseSimple {
    public IfElseSimple (int i1, int i2) {

        System.out.println("Starting IfElseSimple Constructor");
        System.out.println("Starting if-else");
        if (i1 < i2) {
            System.out.println(i1 + " is less than " + i2);
        }
        else
        if (i1 > i2) {
            System.out.println(i1 + " is greater than " + i2);
        }
        else {
            System.out.println(i1 + " is equal to " + i2);
        }
        System.out.println("Ending if-else");
        System.out.println("Ending IfElseSimple Constructor");
    }
}
