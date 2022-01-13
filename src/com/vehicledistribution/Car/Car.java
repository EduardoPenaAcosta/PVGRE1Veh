package com.vehicledistribution.Car;
import com.vehicledistribution.Vehicle.Vehicle;

public class Car extends Vehicle{

    private int doors;
    private int trunkSizeLiters;
    private int vehicleSeats;

    public Car(String brand,String model, int wheels, int cilinder, int horsepower, String paintColor, int doors, int trunkSizeLiters, int vehicleSeats) {
        super(brand, model, wheels, cilinder,horsepower,paintColor);
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
}
