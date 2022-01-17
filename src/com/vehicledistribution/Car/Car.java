package com.vehicledistribution.Car;
import com.vehicledistribution.Vehicle.Vehicle;

public class Car extends Vehicle{

    private final String brand;
    private final String model;
    private final int wheels;
    private final int cilinder;
    private final int horsepower;
    private final String paintColor;


    private int doors;
    private int trunkSizeLiters;
    private int vehicleSeats;

    public Car(String brand,String model, int wheels, int cilinder, int horsepower, String paintColor, int doors, int trunkSizeLiters, int vehicleSeats) {
        super(brand, model, wheels, cilinder,horsepower,paintColor);
        this.brand = brand;
        this.model = model;
        this.wheels = wheels;
        this.cilinder = cilinder;
        this.horsepower = horsepower;
        this.paintColor = paintColor;

        this.doors = doors;
        this.trunkSizeLiters = trunkSizeLiters;
        this.vehicleSeats = vehicleSeats;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getTrunkSizeLiters() {
        return trunkSizeLiters;
    }

    public void setTrunkSizeLiters(int trunkSizeLiters) {
        this.trunkSizeLiters = trunkSizeLiters;
    }

    public int getVehicleSeats() {
        return vehicleSeats;
    }

    public void setVehicleSeats(int vehicleSeats) {
        this.vehicleSeats = vehicleSeats;
    }

    @Override
    public String toString() {
        return "Coche : brand: " + this.brand + ", model: " + this.model + ", wheels: " + this.wheels +
                ", cilinder: " + this.cilinder + ", horsepower: " + this.horsepower + ", color paint: " +
                this.paintColor + "doors: " + this.doors + " trunkSize: " + this.trunkSizeLiters + "l, vehicleSeats: "
                + this.vehicleSeats ;
    }
}
