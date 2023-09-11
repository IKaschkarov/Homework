package de.telran.lesson8;

import java.util.Scanner;

public class EnterWord {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое слово, состоящее из четного количества букв :");
        String firstWord = scanner.nextLine();

        System.out.println("Введите второе слово, состоящее из четного количества букв :");
        String secondWord = scanner.nextLine();

        int firstWordHalf = firstWord.length()/2;
        int secondWordHalf = secondWord.length()/2;

        System.out.println(firstWord.substring(4, firstWordHalf) + secondWord.substring(secondWordHalf));


    }

}

