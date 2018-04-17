package com.nyuf2014.s02.recursion;

/**
 * Created by callas on 9/16/2014.
 */
public class FibonacciSimpleObject {
    protected int  m_fibLength;
    protected long m_fibValue;

    public FibonacciSimpleObject () {
        System.out.println("Starting FibonacciSimpleObject Constructor");
        System.out.println("Ending FibonacciSimpleObject Constructor");
    }
    public FibonacciSimpleObject (int n) {
        super();
        m_fibLength = n;
        m_fibValue  = FibonacciSimpleObject.fib(n);
    }

    // getFibLength
    public int getFibLength() {
        return m_fibLength;
    }

    // getFibValue
    public long getFibValue() {
        return m_fibValue;
    }

    private static long fib (int n) {
        if (n <= 1) {
            return n;
        }
        else {
            return fib(n - 1) + fib(n - 2);
        }
    }
}
