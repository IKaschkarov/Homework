package de.telran.homework19_09;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

        int[] array1 = new int[3];

        Random random = new Random();

        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(89) + 10;
        }
        System.out.println(Arrays.toString(array1));

        boolean increasing = checkIncreasing(array1);

        if (increasing) {
            System.out.println("Массив является строго возрастающей последовательностью");
        } else {
            System.out.println("Массив не является строго возрастающей последовательностью");
        }
    }
    public static boolean checkIncreasing(int[] array1){
        for (int i = 0; i < array1.length-1; i++) {
            if (array1[i] < array1[i + 1]) {
                return false ;
            }

        } return true;
    }
}

  /*
1.Создайте массив из 5 случайных целых чисел из интервала [10;99]

2.Выведите его на консоль в строку.

3.Определите и выведите на экран сообщение о том, является ли
массив строго возрастающей последовательностью.
*/