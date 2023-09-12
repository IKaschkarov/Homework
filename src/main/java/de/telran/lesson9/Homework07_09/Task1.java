package de.telran.lesson9.Homework07_09;

public class Task1 {
    public static void main(String[] args) {

        boolean isWeekend = true;
        boolean isRain = false;

        boolean canWalk;

        if (isWeekend && !isRain) {
            canWalk = true;


        } else {
            canWalk = false;

        }
        System.out.println(" Можно гулять? " + canWalk);
    }


}


//  Создайте две переменные isWeekend и isRain.
// Дайте им свои произвольные значения. Создайте переменную canWalk,
// значение которой должно быть истинным, если это выходной день
// (isWeekend=true) и не идет дождь (isRain=false).