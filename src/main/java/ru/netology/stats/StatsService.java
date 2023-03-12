package ru.netology.stats;

public class StatsService {
    public int totalSum(int[] sales) {
        int sum = 0;
        for (int i : sales) {
            sum = sum + i;
        }
        return sum;
    }

    public int averageSum(int[] sales) {
        int average = 0;
        average = totalSum(sales) / sales.length;
        return average;
    }

    public int maxSumMonth(int[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[maxMonth] <= sales[i]) {
                maxMonth = i;
            }
        }
        return maxMonth+1;
    }

    public int minSumMonth(int[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[minMonth] >= sales[i]) {
                minMonth = i;
            }
        }
        return minMonth+1;
    }

    public int minAvarageMonth(int[] sales) {
        int avarageSum = averageSum(sales);
        int monthCount = 0;
        for (int i : sales){
            if (i < avarageSum)
                monthCount = monthCount+1;
        }
        return monthCount;
    }

    public int maxAvarageMonth(int[] sales) {
        int avarageSum = averageSum(sales);
        int monthCount = 0;
        for (int i : sales){
            if (i > avarageSum)
                monthCount = monthCount+1;
        }
        return monthCount;
    }
}
