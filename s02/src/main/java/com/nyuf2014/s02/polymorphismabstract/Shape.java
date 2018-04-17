package com.nyuf2014.s02.polymorphismabstract;

/**
 * Created by computerlab on 9/13/14.
 */
public abstract class Shape {
    public double area() {
        return 0.0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append(":\tarea = ");
        sb.append(area());
        return sb.toString();
    }

}
