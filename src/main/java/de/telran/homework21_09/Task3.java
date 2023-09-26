package de.telran.homework21_09;

import java.util.Arrays;
import java.util.Random;

/*
Создайте массив из 12 случайных целых чисел из отрезка [-15;15].
 Определите какой элемент является в этом массиве максимальным и
 сообщите индекс его последнего вхождения в массив.
* */
public class Task3 {
    public static void main(String[] args) {

        Random random = new Random();

    int[] intArray = new int[12];

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = - 15 - random.nextInt(15);
        }

        System.out.println("Был сформирован массив " + Arrays.toString(intArray));
    }
}
