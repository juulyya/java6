package ru.netology.stats;

public class Main {
    public static void main(String[] args) {

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService service = new StatsService();

        System.out.println("Сумма продаж " + service.totalSum(sales));

        System.out.println("Средняя сумма продаж " + service.averageSum(sales));

        System.out.println("Пик продаж " + service.maxSumMonth(sales));

        System.out.println("Минимум продаж " + service.minSumMonth(sales));

        System.out.println("Кол-во месяцев ниже среднего  " + service.minAvarageMonth(sales));

        System.out.println("Кол-во месяцев выше среднего  " + service.maxAvarageMonth(sales));

    }
}