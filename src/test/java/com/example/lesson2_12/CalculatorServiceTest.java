package com.example.lesson2_12;

import org.junit.jupiter.api.Test;

import static com.example.lesson2_12.Constants.*;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {

    private final CalculatorService calculatorService = new CalculatorService();


    @Test
   public void checkPlus() {
        int result = calculatorService.plus(ONE, ONE);
        assertEquals(ONE + ONE, result);
    }

    @Test
   public void checkPlus2() {
        int result = calculatorService.plus(FOUR, ONE);
        assertEquals(FOUR + ONE, result);
    }

    @Test
   public void checkMinus() {
        int result = calculatorService.minus(ONE, ONE);
        assertEquals(ONE - ONE, result);
    }

    @Test
   public void checkMinus2() {
        int result = calculatorService.minus(TWO, ONE);
        assertEquals(TWO - ONE, result);
    }

    @Test
   public void checkMultiply() {
        int result = calculatorService.multiply(TWO, TWO);
        assertEquals(TWO * TWO, result);
    }

    @Test
   public void checkMultiply2() {
        int result = calculatorService.multiply(ONE, FOUR);
        assertEquals(ONE * FOUR, result);
    }

    @Test
   public void checkDivide() {
        int result = calculatorService.divide(TWO, ONE);
        assertEquals(TWO / ONE, result);
    }

    @Test
   public void checkDivide2() {
        int result = calculatorService.divide(FOUR, TWO);
        assertEquals(FOUR / TWO, result);
    }

    @Test
   public void checkDivideExceptionZero() {
        assertThrows(IllegalArgumentException.class, () -> calculatorService.divide(TWO, ZERO));
    }

}