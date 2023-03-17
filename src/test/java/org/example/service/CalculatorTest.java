package org.example.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testAddition() {
        double result = Calculator.add(1, 2);
        assertEquals(3.0, result);
    }

    @Test
    void testSquare() {
        double result = Calculator.square(2.0);
        assertEquals(4.0, result);
    }

    @Test
    void demoOfStream() {
        Calculator.demoStream();
    }


}