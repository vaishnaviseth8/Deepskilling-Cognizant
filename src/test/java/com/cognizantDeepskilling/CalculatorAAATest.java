
package com.cognizantDeepskilling;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorAAATest {

    private Calculator calc;

    @Before
    public void setUp() {
        calc = new Calculator();
    }

    @Test
    public void testAddUsingAAA() {
        int a = 10;
        int b = 20;
        int result = calc.add(a, b);
        assertEquals(30, result);
    }

    @Test
    public void testMultiplyUsingAAA() {
        int a = 5;
        int b = 4;
        int result = calc.multiply(a, b);
        assertEquals(20, result);
    }

    @After
    public void tearDown() {
        calc = null;
    }
}