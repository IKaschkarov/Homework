package de.telran.homework21_09;

/*
Напишите программу, которая определит, сколько слов Вы ввели с консоли.
*/
import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);

        System.out.println("Введите текст:");
        String userInput = scanner.nextLine();

        int wordCount = countWords(userInput);

        System.out.println("Количество слов в тексте: " + wordCount);
    }

    private static int countWords(String input) {

        String[] words = input.split("\\s+");
        return words.length;
    }
}



