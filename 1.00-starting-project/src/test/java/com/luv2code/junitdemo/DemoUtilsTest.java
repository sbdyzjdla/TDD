package com.luv2code.junitdemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DemoUtilsTest {

    @Test
    void testEqualsAndNotEquals() {
        DemoUtils demoUtils = new DemoUtils();

        assertEquals(6, demoUtils.add(2, 4), "2+4는 반드시 6이다");
        assertNotEquals(6, demoUtils.add(1,9), " 1+9는 반드시 6이 아니다");
    }

    @Test
    void testNullAndNotNull() {
        DemoUtils demoUtils = new DemoUtils();

        String str1 = null;
        String str2 = "luv2code";

        assertNull(demoUtils.checkNull(str1), "Object should be null");
        assertNotNull(demoUtils.checkNull(str2), "Object should not be null");
    }

}
