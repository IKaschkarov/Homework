package de.telran.lesson9.Homework07_09.Task5;

public class Pizza {

    public static int OurPizza(int diameter) {

        double radius = (double) diameter / 2;
        double kkal =(3.1415 * radius) * radius * 40;
        return (int)kkal;
    }
}
