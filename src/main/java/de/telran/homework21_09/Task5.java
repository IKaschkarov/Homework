package de.telran.homework21_09;

import java.util.Arrays;
import java.util.Random;

/*
Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый
 Выведите массивы на экран в двух отдельных строках
 Посчитайте среднее арифметическое элементов каждого массива и сообщите,
 для какого из массивов это значение оказалось больше (либо сообщите, что их средние арифметические равны)
*/
public class Task5 {
    public static void main(String[] args) {

        Random random = new Random();

        int[] array1 = new int[5];
        int[] array2 = new int[5];

        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(6);
        }
        System.out.println("Массив №1 :" + Arrays.toString(array1));

        double average1 = calculateAverage(array1);

        System.out.println("Среднее арифметическое " + average1);

        for (int i = 0; i < array2.length; i++) {
            array2[i] = random.nextInt(6);
        }
        System.out.println("Массив №2 :" + Arrays.toString(array2));

        double average2 = calculateAverage(array2);

        System.out.println("Среднее арифметическое " + average2);

        if (average1 > average2) {
            System.out.println(" Среднее арифметическое массива №1 больше, чем среднее арифметическое массива №2");
        }
        if (average1 < average2) {
            System.out.println(" Среднее арифметическое массива №2 больше, чем среднее арифметическое массива №1");
        }
        if (average1 == average2) {
            System.out.println(" Среднее арифметическое массива №1 равно среднему арифметическому массива №2");
        }

    }

    public static double calculateAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }

        return (double) sum / array.length;
    }


}
