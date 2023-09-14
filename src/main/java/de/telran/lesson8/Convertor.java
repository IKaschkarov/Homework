package de.telran.lesson8;

import java.util.Scanner;

public class Convertor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму в евро : ");
        double inputEuro = scanner.nextDouble();

        double usd = converter(inputEuro);
        String cutUsd = String.format("%.2f", usd);


        System.out.println("Cумма в долларах США: " + cutUsd);

    }

    public static double converter(double inputEuro) {
        return inputEuro / 1.10;
    }
}
