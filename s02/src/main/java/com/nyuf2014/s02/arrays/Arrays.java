package com.nyuf2014.s02.arrays;

/**
 * Created by callas on 9/16/2014.
 */
public class Arrays {

    public Arrays () {
        // write your code here

        System.out.println("Starting Arrays Constructor");

        System.out.println("print-obj");
        int[] myVar = {1,2,3};
        System.out.println(myVar);


        System.out.println("for-loop");
        int i = 0;
        for (i = 0;i < 3; i++) {
            System.out.println(myVar[i]);
        }

        System.out.println("while");
        i = 0;
        while (i < 3) {
            System.out.println(myVar[i]);
            i++;
        }

        System.out.println("do-while");
        i = 0;
        do {
            System.out.println(myVar[i]);
            i++;
        } while (i < 3);

        System.out.println("for-each-A");
        for (int j : myVar) {
            System.out.println(myVar[j-1]);
        }

        System.out.println("for-each-B");
        for (int j : myVar) {
            System.out.println(j);
        }

        System.out.println("Ending Arrays Constructor");
    }
}
