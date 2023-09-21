package de.telran.homework19_09;

import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {

        int[] myArray = new int[7];

        Random random = new Random();

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(99);
        }

        System.out.println(Arrays.toString(myArray));

        int[] newArray = new int[myArray.length];

        for (int i = 0; i < myArray.length; i++) {
            if (i % 2 == 0) {
                newArray[i] = 0;
            } else {
                newArray[i] = myArray[i];
            }

        }

        System.out.println(Arrays.toString(newArray));
    }


}
/*
1.Создайте массив из 8 случайных целых чисел из интервала [1;50]

2.Выведите массив на консоль в строку.

3.Замените каждый элемент с нечетным индексом на ноль.

4.Снова выведете массив на консоль в отдельной строке.

*/