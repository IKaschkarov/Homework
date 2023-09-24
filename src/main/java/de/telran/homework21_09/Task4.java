package de.telran.homework21_09;

import java.util.Arrays;
import java.util.Random;
/*Создайте массив из 8 случайных целых чисел из отрезка [1;10]
 Выведите массив на экран в строку
 Замените каждый элемент с нечётным индексом на ноль
 Снова выведете массив на экран на отдельной строке
 */

public class Task4 {
    public static void main(String[] args) {

        int[] myArray = new int[7];

        Random random = new Random();

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(10) + 1;
        }

        System.out.println("Исходный массив" + Arrays.toString(myArray));

        int[] newArray = new int[myArray.length];

        for (int i = 0; i < myArray.length; i++) {
            if (i % 2 == 0) {
                newArray[i] = 0;
            } else {
                newArray[i] = myArray[i];
            }

        }

        System.out.println("Массив, где элементы с нечетным индексом заменили на 0 " + Arrays.toString(newArray));
    }
}
