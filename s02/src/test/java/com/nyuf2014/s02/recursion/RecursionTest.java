package com.nyuf2014.s02.recursion;

public class RecursionTest {

    public static void main(String[] args) {
	// write your code here
        // write your code here
        System.out.println("Starting s02e03_recursion Tester");
        System.out.println();

        FibonacciSimpleRecursion aFibonacciSimpleRecursion = new FibonacciSimpleRecursion();
        int n = 1;
        System.out.println("FibonacciSimpleRecursion(" + n + ") is: " + aFibonacciSimpleRecursion.fib(n));
        n = 2;
        System.out.println("FibonacciSimpleRecursion(" + n + ") is: " + aFibonacciSimpleRecursion.fib(n));
        n = 3;
        System.out.println("FibonacciSimpleRecursion(" + n + ") is: " + aFibonacciSimpleRecursion.fib(n));
        n = 4;
        System.out.println("FibonacciSimpleRecursion(" + n + ") is: " + aFibonacciSimpleRecursion.fib(n));
        n = 5;
        System.out.println("FibonacciSimpleRecursion(" + n + ") is: " + aFibonacciSimpleRecursion.fib(n));
        n = 6;
        System.out.println("FibonacciSimpleRecursion(" + n + ") is: " + aFibonacciSimpleRecursion.fib(n));
        System.out.println();

        n = 6;
        FibonacciSimpleObject myFibObj = new FibonacciSimpleObject(n);
        System.out.println("Fib program using a simple object");
        System.out.println("FibonacciSimpleObject Length " + myFibObj.getFibLength());
        System.out.println("FibonacciSimpleObject Value "  + myFibObj.getFibValue());
        System.out.println();

        int indFib = 0;
        long valFib = 0;
        // write your code here
        System.out.println("Fib program using a factory");
        FibonacciFactory myFibFive = new FibonacciFactory();
        indFib = 7;
        valFib = myFibFive.getFib(indFib);
        System.out.println("FibonacciFactory of:   " + indFib + " = " + valFib);
        System.out.println();

        System.out.println("Ending s02e03_recursion Tester");
    }
}
