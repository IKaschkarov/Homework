package de.telran.homework14_09;

public class BankApp {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount(21, "Stefan");

        int moneyInDay;
        int countDay = 0;

        while (account1.balance > 0) {
            countDay++;

            moneyInDay = account1.giveMeMaxMoney();
            System.out.println(countDay + " день :" + " cнято " + moneyInDay + ", осталось " + account1.balance);
        }

        System.out.println("Сумму на счете получится снять за " + countDay + " дн.");
    }

    /*
У вас на банковском счету N долларов.
Вы хотите снять все, но банк разрешает снять только сумму, которая является делителем текущей суммы
на счету и меньше текущей суммы.
Если вы снимаете максимально возможную сумму каждый день, сколько дней вам понадобится, чтобы забрать
все свои деньги из банка?
Примечание: если оставшаяся сумма равна 1, вы можете снять ее.

Ввод:  N = 21
Выход:  7
Объяснение:  N = 21
Снято 7, осталось = 14
Снято 7, осталось = 7
Снято 1, осталось = 6
Снято 3, осталось = 3
Снято 1, осталось = 2
Снято 1, Осталось = 1
Снято 1, осталось = 0
     */
}
