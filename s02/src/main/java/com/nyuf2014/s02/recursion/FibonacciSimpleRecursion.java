package com.nyuf2014.s02.recursion;

/**
 * Created by callas on 9/16/2014.
 */
public class FibonacciSimpleRecursion {
    public FibonacciSimpleRecursion () {
        System.out.println("Starting FibonacciSimpleRecursion Constructor");
        System.out.println("Ending FibonacciSimpleRecursion Constructor");
    }
    public long fib(int n) {
        if (n <= 1) {
            return n;
        }
        else {
            return fib(n - 1) + fib(n - 2);
        }
    }
}
