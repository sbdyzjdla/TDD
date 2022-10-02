package com.luv2code.junitdemo;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class DemoUtilsTest {

    DemoUtils demoUtils;

    @BeforeEach
    void setupBeforeEach() {
        demoUtils = new DemoUtils();
        System.out.println("Running test : @BeforeEach");
    }

    @AfterEach
    void tearDownAfterEach() {
        System.out.println("Running test : @AfterEach");
    }

    @BeforeAll
    static void setupBeforeAfterClass() {
        System.out.println("@BeforeAll");
    }

    @AfterAll
    static void setupAfterAllClass() {
        System.out.println("@AfterAll");
    }

    @Test
    @DisplayName("Equals and Not Equals")
    void testEqualsAndNotEquals() {

        System.out.println("RUnning test : testEqualsAndNotEquals");

        assertEquals(6, demoUtils.add(2, 4), "2+4는 반드시 6이다");
        assertNotEquals(6, demoUtils.add(1,9), " 1+9는 반드시 6이 아니다");
    }

    @Test
    @DisplayName("Null and Not Null")
    void testNullAndNotNull() {

        System.out.println("RUnning test : testNullAndNotNull");

        String str1 = null;
        String str2 = "luv2code";

        assertNull(demoUtils.checkNull(str1), "Object should be null");
        assertNotNull(demoUtils.checkNull(str2), "Object should not be null");
    }

    @Test
    @DisplayName("Same and Not Same")
    void testSameAndNotSame() {
        String str = "luv2code";

        assertSame(demoUtils.getAcademy(), demoUtils.getAcademyDuplicate(), "같은 객체여야 한다");
        assertNotSame(str, demoUtils.getAcademy(), "같은 객체가 아니여야 한다");
    }

    @Test
    @DisplayName("True and False")
    void testTrueFalse() {
        int gradeOne = 10;
        int gradeTwo = 5;

        assertTrue(demoUtils.isGreater(gradeOne, gradeTwo), "true를 반환 한다.");
        assertFalse(demoUtils.isGreater(gradeTwo, gradeOne), "false를 반환한다.");
    }

}
