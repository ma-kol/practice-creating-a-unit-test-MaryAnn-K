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

    /*
    - The test class mirrors the name of the class being tested (with Test at the end)
    - The test method name clearly describes what is being tested
    - he test can run independently and doesn’t rely on other tests
    - There is at least one test for the normal (“happy path”) case
    - There is at least one test for an edge case or unusual input
    - The test uses appropriate assertions to verify behavior
     */

    @Test
    public void absoluteTest() {
        assert Calculator.absolute(8) == 8; /* happy path test */
        assert Calculator.absolute(Integer.MIN_VALUE) == Integer.MIN_VALUE; /* edge case test */
    }
}
