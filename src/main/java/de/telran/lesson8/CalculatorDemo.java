package de.telran.lesson8;

     import de.telran.lesson8.Calculator;

     import java.util.Scanner;
public class CalculatorDemo {

        public static void main(String[] args) {

            Calculator calc = new Calculator(); // создаем новый экземпляр класса "Calculator" - calc
            Scanner enter = new Scanner(System.in); // создаем новый экземпляр класса "Scanner" - enter


            System.out.print("Введите первое число (возможно дробное): ");
            double x = enter.nextDouble(); //  ввод 1-го числа с клавиатуры
            System.out.print("Введите второе число (возможно дробное): ");
            double y = enter.nextDouble(); //  ввод 2-го числа с клавиатуры



            System.out.println(x + " / " + y + " = " + calc.div(x, y));
            System.out.println(x + " * " + y + " = " + calc.mul(x, y));
            System.out.println(x + " - " + y + " = " + calc.sub(x, y));
            System.out.println(x + " + " + y + " = " + calc.sum(x, y));



        }

}
