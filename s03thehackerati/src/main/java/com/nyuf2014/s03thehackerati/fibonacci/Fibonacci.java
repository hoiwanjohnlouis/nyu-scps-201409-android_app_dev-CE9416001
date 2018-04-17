package com.nyuf2014.s03thehackerati.fibonacci;

import java.util.ArrayList;

public class Fibonacci {
    // members
    protected int m_fibLength;
    protected long m_fibValue;

    // class fields
    protected static ArrayList<Fibonacci> fibValues;

    // static initializer
    static {
        fibValues = new ArrayList<Fibonacci>();
    }

    // class methods

    // long fib(int n)
    public static long fib(int n) {
        if (n <= 1) {
            return n;
        }
        else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    // Fibonacci getFib(int n)
    public static Fibonacci getFib(int n) {
        Fibonacci returnVal = null;
        for (Fibonacci f: fibValues) {
            if (f.getFibLenth() == n) {
                returnVal = f;
            }
        }
        if (returnVal == null) {
            returnVal = new Fibonacci(n);
        }
        return returnVal;
    }

    // ctor
    public Fibonacci(int n) {
        m_fibLength = n;
        m_fibValue = Fibonacci.fib(n);
        fibValues.add(this);
    }

    // getFibLength()
    public int getFibLenth() {
        return m_fibLength;
    }

    // get FibValue()
    public long getFibValue() {
        return m_fibValue;
    }
}
