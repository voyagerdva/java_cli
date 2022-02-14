package com.qwertovsky.hellow;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value=org.junit.runners.Parameterized.class)
public class TestCalculator
{
    int expected;
    int[] arg;

    @Parameters
    public static Collection<int[][]> parameters()
    {

        return Arrays.asList(new int[][][]{
                {{4}, {2, 2}}
                ,{{-1},{4, -5}}
                ,{{0},{0,0,0}}
                ,{{0},{}}
        });
    }

    public TestCalculator(int[] expected, int[] arg)
    {
        this.expected=expected[0];
        this.arg=arg;
    }

    @Test
    public void testSum()
    {
        Calculator c=new Calculator();
        assertEquals(expected,c.sum(arg));
    }
}