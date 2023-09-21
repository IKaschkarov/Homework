package de.telran.raceExample;

public class Car {
    private String producer;
    private String model;
    private int maxSpeed;

    public Car(String producer, String model, int maxSpeed) {
        this.producer = producer;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public String getProducer() {
        return producer;
    }

    public String getModel() {
        return model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
}
