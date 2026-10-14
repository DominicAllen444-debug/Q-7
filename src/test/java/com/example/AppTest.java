package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class AppTest {
    @Test
    void reversesPositiveNumberAndDropsLeadingZeros() {
        assertEquals(4321L, new App().reverseNumber(1234));
        assertEquals(21L, new App().reverseNumber(1200));
    }

    @Test
    void handlesNegativeNumbersAndZero() {
        assertEquals(-321L, new App().reverseNumber(-123));
        assertEquals(0L, new App().reverseNumber(0));
    }
}
