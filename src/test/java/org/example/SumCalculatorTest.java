package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumCalculatorTest {

    private SumCalculator sumCalculator;

    @BeforeEach
    public void BeforeEach(){
        sumCalculator = new SumCalculator();
    }

    @Test
    void sumTestForThree() {
        int result = sumCalculator.sum(3);
        int expResult = 6;

        assertEquals(expResult, result);
    }

    @Test
    void sumTestForOne() {
        int result = sumCalculator.sum(1);
        int expResult = 1;

        assertEquals(expResult, result);
    }

    @Test
    void sumTestForException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            sumCalculator.sum(0);
        });
    }
}