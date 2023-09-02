package de.telran.lesson2;

import java.util.Scanner;

public class TestScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число:");
       int myInt = scanner.nextInt();
       int mySum = myInt + 10;
        System.out.println(mySum);

        System.out.print("Введите дробное число:");
        double myDouble = scanner.nextDouble();
        System.out.println(myDouble-10);

        Scanner scannerStr = new Scanner(System.in);

        System.out.print("Введите текст:");
        String myStr = scannerStr.nextLine();
        System.out.println(myStr + "!!!");

    }


}
