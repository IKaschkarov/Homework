package de.telran.homework21_09;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*Пользователь должен ввести с клавиатуры размер массива - натуральное число больше 3.
 Введенное пользователем число сохраняется в переменную n.
 Если пользователь ввёл не подходящее число, то программа должна просить пользователя повторить ввод.
 Создать массив из n случайных целых чисел из отрезка [0;n] и вывести его на экран.
 Создать второй массив только из чётных элементов первого массива, если они там есть, и вывести его на экран.
*/

public class Task2 {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);


        System.out.println("Введите размер массива (он должен быть больше числа 3): ");

        int arraySize = scanner.nextInt();
        int[] myArray = new int[arraySize];

        if (arraySize <= 3) {
            System.out.println("Попробуйте еще раз ввести размер массива :");

        }
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(arraySize);
        }

        System.out.println("По вашему запросу был сформирован массив из " + arraySize + " элементов" + Arrays.toString(myArray));

        int counter = 0;

        int[] newArray = new int[counter];

        for (int i = 0; i < (myArray.length -1); i++) {
            if (i % 2 != 0) {
              newArray[i] = myArray[i];
              counter++;

            }
            System.out.println("Исходный массив не содержит четных чисел");
        }
    }
}
