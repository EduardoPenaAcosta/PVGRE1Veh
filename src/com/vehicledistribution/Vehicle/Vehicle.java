package com.vehicledistribution.Vehicle;

public class Vehicle {

    private String brand;
    private String model;

    private int wheels;
    private int cilinder;
    private int horsepower;
    private String paintColor;

    public Vehicle(String brand, String model, int wheels, int cilinder, int horsepower, String paintColor) {
        this.brand = brand;
        this.model = model;
        this.wheels = wheels;
        this.cilinder = cilinder;
        this.horsepower = horsepower;
        this.paintColor = paintColor;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getCilinder() {
        return cilinder;
    }

    public void setCilinder(int cilinder) {
        this.cilinder = cilinder;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public String getPaintColor() {
        return paintColor;
    }

    public void setPaintColor(String paintColor) {
        this.paintColor = paintColor;
    }

}
