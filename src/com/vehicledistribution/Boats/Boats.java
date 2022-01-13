package com.vehicledistribution.Boats;


import com.vehicledistribution.Vehicle.Vehicle;

public class Boats extends Vehicle {

    private double length;
    private boolean parking;
    private boolean comercial;

    public Boats(String brand, String model, int wheels, int cilinder, int horsepower, String paintColor, double length, boolean parking, boolean comercial) {
        super(brand, model, wheels, cilinder, horsepower, paintColor);
        this.length = length;
        this.parking = parking;
        this.comercial = comercial;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public boolean isParking() {
        return parking;
    }

    public void setParking(boolean parking) {
        this.parking = parking;
    }

    public boolean isComercial() {
        return comercial;
    }

    public void setComercial(boolean comercial) {
        this.comercial = comercial;
    }
}
