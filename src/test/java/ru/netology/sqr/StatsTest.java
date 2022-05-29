package ru.netology.sqr;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsTest {
    @org.junit.jupiter.api.Test
    void shouldCalculateSum() {
        StatsService servise = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = servise.sum(sales);
        int expected = 180;

        assertEquals(expected, actual);

    }

    @org.junit.jupiter.api.Test
    void shouldCalculateAverage() {
        StatsService servise = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = servise.average(sales);
        int expected = 15;

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateMaxMonth() {
        StatsService servise = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = servise.maxMonth(sales);
        int expected = 8;

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateMinMonth() {
        StatsService servise = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = servise.minMonth(sales);
        int expected = 9;

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateBelowAverage() {
        StatsService servise = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = servise.countBelowAverage(sales);
        int expected = 5;

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateAboweAverage() {
        StatsService servise = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = servise.countAboveAverage(sales);
        int expected = 5;

        assertEquals(expected, actual);
    }
}
