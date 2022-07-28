package com.example.lesson2_12;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static com.example.lesson2_12.Constants.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorParamsTest {

    private final CalculatorService calculatorService = new CalculatorService();

    @ParameterizedTest
    @MethodSource("paramsTest")
    public void checkPlusParams(int num1, int num2) {
        int result = calculatorService.plus(num1, num2);
        assertEquals(num1 + num2, result);
    }

    @ParameterizedTest
    @MethodSource("paramsTest")
    public void checkMinusParams(int num1, int num2) {
        int result = calculatorService.minus(num1, num2);
        assertEquals(num1 - num2, result);
    }

    @ParameterizedTest
    @MethodSource("paramsTest")
    public void checkMultiplyParams(int num1, int num2) {
        int result = calculatorService.multiply(num1, num2);
        assertEquals(num1 * num2, result);
    }

    @ParameterizedTest
    @MethodSource("paramsTest")
    public void checkDivideParams(int num1, int num2) {
        int result = calculatorService.divide(num1, num2);
        assertEquals(num1 / num2, result);
    }


    public static Stream<Arguments> paramsTest() {
        return Stream.of(
                Arguments.of(ONE, TWO),
                Arguments.of(FOUR, TWO),
                Arguments.of(ONE, FOUR)
        );
    }
}
