package de.telran.lesson9.Homework07_09;

public class ShopDemo {

    public static void main(String[] args) {
        Shop myShop = new Shop();

        System.out.println("Могу я идти в магазин -  " + myShop.canBuy(false, true));
    }
}
 /*Создайте две  переменные isEdekaOpen и isReweOpen,
  значения которых зависят от того, открыты магазины
  или нет (значения задайте сами). Реализуйте логический
  метод canBuy, возвращающий true / false Значение этой
  переменной должно быть true, если хотя бы один магазин открыт,
  иначе false. Отобразите строку «Я могу купить еду, это ……» и значение.
  */