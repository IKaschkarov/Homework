package de.telran.lesson8;

import java.util.Scanner;
public class TransformNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первоначальную систему счисление = ");
        int inNumbers = scanner.nextInt();

        System.out.print("Введите число = ");
        String inStr = scanner.next(); //1af
        long inStrNumber = Long.parseLong(inStr, inNumbers);

        System.out.print("В какую систему счисления преобразовать = ");
        int outNumbers = scanner.nextInt();

        System.out.println("Преобразованное число = " + Long.toString(inStrNumber, outNumbers));
    }
}