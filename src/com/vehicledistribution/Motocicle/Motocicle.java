package com.vehicledistribution.Motocicle;

import com.vehicledistribution.Vehicle.Vehicle;

public class Motocicle  extends Vehicle{

    private boolean sidecar;

    public Motocicle(String brand,String model, int wheels, int cilinder, int horsepower, String paintColor,boolean sidecar) {
        super(brand, model, wheels, cilinder, horsepower, paintColor);
        this.sidecar = sidecar;
    }

    public boolean isSidecar() {
        return sidecar;
    }

    public void setSidecar(boolean sidecar) {
        this.sidecar = sidecar;
    }
}
