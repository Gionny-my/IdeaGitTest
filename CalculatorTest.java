package com.my.util;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    private static Calculator calculator = new Calculator();
    private double inaccuracy = 0.0000001;

    @Before
    public void setUp() throws Exception {
        calculator.clear();
    }

    @Test
    public void testAdd() throws Exception {
        calculator.add(1);
        assertEquals(1, calculator.getResult(), inaccuracy);
    }

    @Test
    public void testSubtract() throws Exception {
        calculator.add(3);
        calculator.subtract(2);
        assertEquals(1, calculator.getResult(), inaccuracy);
    }

    @Test
    public void testMultiply() throws Exception {
        calculator.add(5);
        calculator.multiply(8);
        assertEquals(40, calculator.getResult(), inaccuracy);
    }

    @Test
    public void testDivide() throws Exception {
        calculator.add(6);
        calculator.divide(3);
        assertEquals(2, calculator.getResult(), inaccuracy);
    }

    @Test
    public void testMulCalculate() throws Exception {
        calculator.add(1);
        calculator.subtract(2);
        calculator.multiply(3);
        calculator.divide(4);
        assertEquals(-0.75, calculator.getResult(), inaccuracy);
    }

}