package com.nyuf2014.s01.simpleinheritance;

/**
 * Created by callas on 9/16/2014.
 */
public class Dog extends Animal {
    Dog() { System.out.println("I'm a dog!"); }
    public String talk () {
        return "Woof!";
    };
}
