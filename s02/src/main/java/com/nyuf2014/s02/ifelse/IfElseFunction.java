package com.nyuf2014.s02.ifelse;

/**
 * Created by callas on 9/16/2014.
 */
public class IfElseFunction {
    public IfElseFunction () {
        System.out.println("Starting IfElseFunction Constructor");
        System.out.println("Ending IfElseFunction Constructor");
    }
    protected void compareValues (int i1, int i2) {

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

        return;
    }
}
