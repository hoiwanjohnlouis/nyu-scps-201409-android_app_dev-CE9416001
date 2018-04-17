package com.nyuf2014.s01.simpleinheritance;

/**
 * Created by callas on 9/16/2014.
 */
public class StuffedPoodle extends Dog {
    StuffedPoodle() { System.out.println("I'm a stuffed poodle!"); }
    public String talk() {
        return "I cannot bark!";
    }
}
