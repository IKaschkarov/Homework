package de.telran.lesson8;

import java.util.Scanner;

public class Convertor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму в евро : ");
        double inputEuro = scanner.nextDouble();

        double usdAmount = converter(inputEuro); // отправляем на конвертацию
        String cutUsdAmount = String.format("%.2f", usdAmount); // округляем значение до двух цифр после запятой


        System.out.println("Cумма в долларах США: " + cutUsdAmount); //печатаем результат

    }

    public static double converter(double inputEuro) {
        return inputEuro / 1.10;
    }
}
