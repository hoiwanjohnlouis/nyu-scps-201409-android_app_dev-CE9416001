package com.nyuf2014.s02.recursion;

import java.util.ArrayList;

/**
 * Created by callas on 9/16/2014.
 */
public class FibonacciFactory {
    protected int m_fibLength;
    protected long m_fibValue;
    static ArrayList<FibonacciFactory> m_fibValues;

    static {
        m_fibValues = new ArrayList<FibonacciFactory>();
    }

    public FibonacciFactory() {
        System.out.println("Starting FibonacciFactory Constructor");
        System.out.println("Ending FibonacciFactory Constructor");
    }

    public long getFib(int n) {

        long la = 0;

        // ensure the fib number does not exists before adding in container,
        // this will save on processing time.
        for (FibonacciFactory tmp : m_fibValues) {
            if (tmp.getFibLength() == n) {
                la = tmp.getFibValue();
            }
        }
        // first time requesting this fibonacci number, calculate and save
        if (la == 0) {
            m_fibLength = n;
            m_fibValue  = FibonacciFactory.fib(n);
            la          = m_fibValue;
            m_fibValues.add(this);
        } else {
            // we already calculated this fib before, return that value
            ;
        }
        return la;
    }

    // getFibLength
    public int getFibLength() {
        return m_fibLength;
    }

    // getFibValue
    public long getFibValue() {
        return m_fibValue;
    }

    private static long fib(int n) {
        if (n <= 1) {
            return n;
        }
        else {
            return fib(n - 1) + fib(n - 2);
        }
    }
}
