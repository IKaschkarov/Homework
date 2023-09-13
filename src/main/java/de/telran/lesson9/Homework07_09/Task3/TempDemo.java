package de.telran.lesson9.Homework07_09.Task3;

import java.util.Scanner;

public class TempDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите показания температуры первой колбы : ");
        double Temperature1 = scanner.nextDouble();

        System.out.println("Введите показания температуры второй колбы : ");
        double Temperature2 = scanner.nextDouble();

        boolean checkT = CheckTemp.Check(Temperature1, Temperature2);

        System.out.println("Прибор работает: " + checkT);

    }

}
/*Представим, что у нас есть устройство, в котором две колбы.
Прибор работает корректно, если температура первой колбы выше
100 градусов, а температура второй колбы меньше 100 градусов.
Вы должны написать метод, который проверяет это устройство.
Ваша программа должна иметь переменные Temperature1 и Temperature2.
В результате он выводит сообщение true или false.
 */