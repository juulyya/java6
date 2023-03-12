package ru.netology.stats;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class StatsServiceTest {

    @org.junit.jupiter.api.Test
    public void totalSumTest() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        int expected = 180;
        int actual = service.totalSum(sales);

        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void avarageSumTest() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        int expected = 15;
        int actual = service.averageSum(sales);

        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void maxSumMonthTest() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        int expected = 8;
        int actual = service.maxSumMonth(sales);

        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void minSumMonthTest() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        int expected = 9;
        int actual = service.minSumMonth(sales);

        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void minAvarageMonthTest() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        int expected = 5;
        int actual = service.minAvarageMonth(sales);

        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void maxAvarageMonthTest() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        int expected = 5;
        int actual = service.maxAvarageMonth(sales);

        Assertions.assertEquals(expected, actual);
    }


}
