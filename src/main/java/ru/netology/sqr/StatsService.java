package ru.netology.sqr;

public class StatsService {
    public long sum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long average(long[] sales) {
        long sum = sum(sales);
        return sum / sales.length;
    }

    public int maxMonth(long[] sales) {
        int maxMonth = 0;
        for (int month = 0; month < sales.length; month++) {
            if (sales[month] >= sales[maxMonth]) {
                maxMonth = month;
            }
        }
        return maxMonth + 1;
    }

    public int minMonth(long[] sales) {
        int minMonth = 0;
        for (int month = 0; month < sales.length; month++) {
            if (sales[month] <= sales[minMonth]) {
                minMonth = month;
            }
        }
        return minMonth + 1;
    }

    public int countBelowAverage (long[] sales) {
        long average = average(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale < average) {
                count++;
            }
        }
        return count;
    }
    public int countAboveAverage(long[] sales) {
        long average = average (sales);
        int count = 0;
        for (long sale: sales){
            if (sale > average) {
                count ++;
            }
        }
        return count;
    }

}
