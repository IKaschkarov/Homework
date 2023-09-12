package de.telran.lesson9.Homework07_09;

public class ShopDemo {

    public static void main(String[] args) {
        Shop myShop = new Shop();

        System.out.println("Могу я идти в магазин -  " + myShop.canBuy(false, true));
    }
}
