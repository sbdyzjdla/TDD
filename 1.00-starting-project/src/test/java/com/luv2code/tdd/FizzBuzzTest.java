package com.luv2code.tdd;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class FizzBuzzTest {

    /**
     * 요구사항
     * 1. 숫자가 3으로 나눌수 있으면 Fizz 출력
     * 2. 숫자가 5으로 나눌수 있으면 Buzz 출력
     * 3. 숫자가 3과5로 으로 나눌수 있으면 FizzBuzz 출력
     * 4. 숫자가 3과5로 나눌수 없다면 숫자를 출력
     */

    @Order(1)
    @DisplayName("3으로 나누어진다")
    @Test
    void testForDivisibleByThree() {
        String expected = "Fizz";

        assertEquals(expected, FizzBuzz.compute(3), "should return Fizz");
    }

    @Order(2)
    @DisplayName("5으로 나누어진다")
    @Test
    void testForDivisibleByFive() {
        String expected = "Buzz";

        assertEquals(expected, FizzBuzz.compute(5), "should return Buzz");
    }

    @Order(3)
    @DisplayName("3과5로 나누어진다")
    @Test
    void testForDivisibleByThreeAndFive() {
        String expected = "FizzBuzz";

        assertEquals(expected, FizzBuzz.compute(15), "should return FizzBuzz");
    }

    @Order(4)
    @DisplayName("3과5로 나누어지지 않는다")
    @Test
    void testForNotDivisibleByThreeAndFive() {
        String expected = "1";

        assertEquals(expected, FizzBuzz.compute(1), "should return 1");
    }
}
