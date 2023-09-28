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
        int length = myArray.length;

        System.out.print("Обратный порядок элементов массива: ");

        for (int i = length - 1; i >= 0; i--) {

            System.out.print( myArray[i] + ", ");
        }
    }
}
