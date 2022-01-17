package com.vehicledistribution.Boats;


import com.vehicledistribution.Vehicle.Vehicle;

public class Boats extends Vehicle {

    private final String brand;
    private final String model;
    private final int cilinder;
    private final int horsepower;
    private final String paintColor;
    private double length;
    private boolean comercial;

    public Boats(String brand, String model, int wheels, int cilinder, int horsepower, String paintColor, double length, boolean comercial) {
        super(brand, model, wheels, cilinder, horsepower, paintColor);
        this.brand = brand;
        this.model = model;
        this.cilinder = cilinder;
        this.horsepower = horsepower;
        this.paintColor = paintColor;

        this.length = length;
        this.comercial = comercial;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }


    public boolean isComercial() {
        return comercial;
    }

    public void setComercial(boolean comercial) {
        this.comercial = comercial;
    }

    @Override
    public String toString() {
        return "Barco : brand: " + this.brand + ", model: " + this.model +  ", cilinder: " + this.cilinder +
                ", horsepower: " + this.horsepower + ", color paint: " + " length: " + this.length +
                ", comercial: " + this.comercial;
    }

}
