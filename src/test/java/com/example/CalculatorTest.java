package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    void addsTwoNumbers() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.add(2, 3));
    }

    @Test
    void subtractsTwoNumbers() {
        Calculator calc = new Calculator();
        assertEquals(1, calc.subtract(4, 3));
    }
}
