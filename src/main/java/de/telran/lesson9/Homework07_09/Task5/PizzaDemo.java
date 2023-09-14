package de.telran.lesson9.Homework07_09.Task5;

import java.util.Scanner;

public class PizzaDemo {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите диаметр первой пиццы : ");
        int pizza1 = scanner.nextInt();

        System.out.println("Введите диаметр второй пиццы : ");
        int pizza2 = scanner.nextInt();
        int kkalPizza1 = Pizza.OurPizza(pizza1);
        System.out.println(" Пицца 1 содержит " + kkalPizza1 + " калорий");

        int kkalPizza2 = Pizza.OurPizza(pizza2);
        System.out.println(" Пицца 2 содержит " + kkalPizza2 + " калорий");

        if (pizza1 > pizza2) {
            int over = kkalPizza1 - kkalPizza2;
            System.out.println(" Вы употребите на " + over + " ккал больше");

        } else if (pizza1 < pizza2) {
            int over = kkalPizza2 - kkalPizza1;
            System.out.println(" Вы употребите на " + over + " ккал больше");

        } else {
            System.out.println(" Вы употребите одинаковое количество ккал");
        }

    }

}
