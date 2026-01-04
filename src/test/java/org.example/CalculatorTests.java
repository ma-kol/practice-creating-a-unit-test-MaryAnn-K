package org.example;

import org.junit.Test;

public class CalculatorTests {
    @Test
    public void testAdd() {
        assert Calculator.add(1, 2) == 3;
        assert Calculator.add(0, 0) == 0;
        assert Calculator.add(-1, -1) == -2;
    }

    @Test
    public void testSubtract() {
        assert Calculator.subtract(1, 2) == -1;
        assert Calculator.subtract(0, 0) == 0;
        assert Calculator.subtract(-1, -1) == 0;
    }

    @Test
    public void testMultiply() {
        assert Calculator.multiply(1, 2) == 2;
        assert Calculator.multiply(0, 0) == 0;
        assert Calculator.multiply(-1, -1) == 1;
    }

    @Test
    public void testDivide() {
        assert Calculator.divide(8, 2) == 4;
        assert Calculator.divide(0, 1) == 0;
        assert Calculator.divide(-1, -1) == 1;
    }

    @Test
    public void absoluteTest() {
        assert Calculator.absolute(8) == 8; /* happy path test */
        assert Calculator.absolute(Integer.MIN_VALUE) == Integer.MIN_VALUE; /* edge case test */
    }
}
