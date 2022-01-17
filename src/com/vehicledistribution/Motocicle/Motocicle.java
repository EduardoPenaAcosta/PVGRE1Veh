package com.vehicledistribution.Motocicle;

import com.vehicledistribution.Vehicle.Vehicle;

public class Motocicle  extends Vehicle{

    private final String brand;
    private final String model;
    private final int wheels;
    private final int cilinder;
    private final int horsepower;
    private final String paintColor;
    private boolean sidecar;

    public Motocicle(String brand,String model, int wheels, int cilinder, int horsepower, String paintColor,boolean sidecar) {
        super(brand, model, wheels, cilinder, horsepower, paintColor);
        this.brand = brand;
        this.model = model;
        this.wheels = wheels;
        this.cilinder = cilinder;
        this.horsepower = horsepower;
        this.paintColor = paintColor;

        this.sidecar = sidecar;
    }

    public boolean isSidecar() {
        return sidecar;
    }

    public void setSidecar(boolean sidecar) {
        this.sidecar = sidecar;
    }


    @Override
    public String toString() {
        return "Motocicleta : brand: " + this.brand + ", model: " + this.model + ", wheels: " + this.wheels +
                ", cilinder: " + this.cilinder + ", horsepower: " + this.horsepower + ", color paint: " +" sidecar: " + this.sidecar;
    }

}
