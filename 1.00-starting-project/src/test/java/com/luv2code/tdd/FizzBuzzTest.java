package com.luv2code.tdd;

import org.junit.jupiter.api.*;

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
        fail("fail");
    }
}
