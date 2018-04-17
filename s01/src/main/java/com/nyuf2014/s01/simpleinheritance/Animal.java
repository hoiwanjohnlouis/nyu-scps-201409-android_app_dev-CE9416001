package com.nyuf2014.s01.simpleinheritance;

/**
 * Created by callas on 9/16/2014.
 */
public abstract class Animal implements IAnimal {

    Animal() { System.out.println("I'm an animal!"); }

    public String talk () {
        return "I do not want to talk.";
    };
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("A(n) ");
        sb.append(getClass().getName());
        sb.append(" says ");
        sb.append(talk());
        return sb.toString();
    }

}
