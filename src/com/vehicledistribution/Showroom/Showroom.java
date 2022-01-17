package com.vehicledistribution.Showroom;

public class Showroom {

    private static int vehicleSpace;
    private static int showVehicles;

    public Showroom(int vehicleSpace, int showVehicles) {
        Showroom.vehicleSpace = vehicleSpace;
        Showroom.showVehicles = showVehicles;
    }

    public static int getVehicleSpace() {
        return vehicleSpace;
    }

    public void setVehicleSpace(int vehicleSpace) {
        this.vehicleSpace = vehicleSpace;
    }

    public static int getShowVehicles() {
        return showVehicles;
    }

    public void setShowVehicles(int showVehicles) {
        this.showVehicles = showVehicles;
    }

    public static boolean correctSpaces(Showroom showroom){
        return getShowVehicles() <= getVehicleSpace();
    }
}
