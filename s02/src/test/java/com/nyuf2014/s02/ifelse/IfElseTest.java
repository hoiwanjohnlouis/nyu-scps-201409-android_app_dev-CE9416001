package com.nyuf2014.s02.ifelse;

public class IfElseTest {

    public static void main(String[] args) {
    	// write your code here
        IfElseSimple aIfElseSimple = new IfElseSimple(1,2);
        System.out.println();

        IfElseFunction aIfElseFunction = new IfElseFunction();
        aIfElseFunction.compareValues(3,4);
        aIfElseFunction.compareValues(5,4);
        aIfElseFunction.compareValues(6,6);
        System.out.println();

    }
}
