package de.telran.lesson9;

public class Dog {
    String dogName;
    int dogAge;
    String dogColor;
    String newColor;


    public Dog(String dogName, int dogAge, String dogColor) {
        this.dogName = dogName;
        this.dogAge = dogAge;
        this.dogColor = dogColor;
    }

    public void voice() {
        System.out.println("Имя собаки " + dogName + ", " + "Возраст" + " " + dogAge + ", " + "Окрас " + dogColor);

    }

    public void happyBirthday() {
        this.dogAge++;
    }

    public void dogColor( String newColor){
        this.dogColor = newColor;
    }
}