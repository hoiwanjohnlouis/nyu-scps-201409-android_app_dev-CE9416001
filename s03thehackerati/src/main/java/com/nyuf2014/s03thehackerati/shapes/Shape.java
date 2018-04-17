package com.nyuf2014.s03thehackerati.shapes;

public abstract class Shape implements IShape {
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(":\tarea = ");
        sb.append(area());
        return sb.toString();
    }
    public int foobarDivideByZero() throws Exception {
        int x = 1/0;
        //System.out.println(x);
        return x;
    }
}
