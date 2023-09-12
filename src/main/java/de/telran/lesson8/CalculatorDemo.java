package de.telran.lesson8;

     import de.telran.lesson8.Calculator;

     import java.util.Scanner;
public class CalculatorDemo {

        public static void main(String[] args) {

            Calculator calc = new Calculator();
            Scanner enter = new Scanner(System.in);


            System.out.print("Введите первое число (возможно дробное): ");
            double x = enter.nextDouble();
            System.out.print("Введите второе число (возможно дробное): ");
            double y = enter.nextDouble();



            System.out.println(x + " / " + y + " = " + calc.div(x, y));
            System.out.println(x + " * " + y + " = " + calc.mul(x, y));
            System.out.println(x + " - " + y + " = " + calc.sub(x, y));
            System.out.println(x + " + " + y + " = " + calc.sum(x, y));



        }

}
