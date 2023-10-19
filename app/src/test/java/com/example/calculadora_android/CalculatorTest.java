package com.example.calculadora_android;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {
    private Calculator calculator;
    public void setUp() throws Exception {
        super.setUp();
        calculator = new Calculator();
    }

    public void testSum() {
        double result = calculator.sum(1d, 1d);
        assertEquals(2d, result, 0);
    }

    public void testSub() {
        double result = calculator.sub(1d, 1d);
        assertEquals(0d, result, 0);
    }

    public void testMult() {
        double result = calculator.mult(2d, 2d);
        assertEquals(4d, result, 0);
    }

    public void testDiv() {
        double result = calculator.div(10d, 2d);
        assertEquals(5d, result);
    }

}