package de.telran.lesson12;

import java.util.Scanner;

public class LessonCode {
    /*
   написать программу которая запрашивает у пользователя целое число
    и выводит на консоль четное оно или нет

    написать тест

    */
    public static void main(String[] args) {

        System.out.println("Введите целое число :");

        Scanner scanner = new Scanner(System.in);
        int userNumber = scanner.nextInt();

        CheckNumbers checks = new CheckNumbers();


        if (checks.isEven(userNumber)) {
            System.out.println("Вы ввели четное число ");
        } else {
            System.out.println("Вы ввели нечетное число ");
        }

    }
}
