package de.telran.Homework26_08.Task2;

public class ParseNumber {
    public static void main(String[] args) {
        int x = 965;

        System.out.println("Число " + x + "->"+ x/100 +"," + x %100/10 + "," + x% 10);

    }
}
/*
Дано трехзначное число. Вывести на экран все цифры этого числа,
которые вы должны получить в результате математических действий над этим числом.

Пример: 345
Вывод в консоль: Число 345 -> 3, 4, 5
 */