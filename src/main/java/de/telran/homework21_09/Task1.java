package de.telran.homework21_09;

import java.util.Arrays;

/* Напишите программу, которая меняет местами элементы одномерного массива
из String в обратном порядке.
Не используйте дополнительный массив для хранения результатов.
 */
public class Task1 {
    public static void main(String[] args) {

        String[] myArray = {"a", "b", "c", "d", "e"};

        System.out.println("Прямой порядок элементов массива:" + Arrays.toString(myArray));

        reverseArray(myArray);

        System.out.print("Обратный порядок элементов массива: " + Arrays.toString(myArray));

    }
    private static void reverseArray(String[] myArray) {
        int length = myArray.length;

        for (int i = 0; i < length / 2; i++) {

            String temp = myArray[i];
            myArray[i] = myArray[length - 1 - i];
            myArray[length - 1 - i] = temp;
        }
    }
}

