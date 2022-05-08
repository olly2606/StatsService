package ru.netology.sqr;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SQRTest {
    @org.junit.jupiter.api.Test
    void shouldCalculateForSqrUnderLimit() {
        SQRService servise = new SQRService();

        int actual = servise.sqrСount(200, 300);
        int expected = 3;

        assertEquals(expected, actual);

    }
}
