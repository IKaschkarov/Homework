package de.telran.lesson9.Homework07_09.Task3;

public class TempDemo {
    public static void main(String[] args) {

        double Temperature1 = 105.0;
        double Temperature2 = 101.6;

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