package com.vehicledistribution;

import com.vehicledistribution.Car.Car;
import com.vehicledistribution.CreateVehicle.CreateVehicle;
import com.vehicledistribution.Showroom.Showroom;
import com.vehicledistribution.Vehicle.Vehicle;

public class Main {

    public static void main(String[] args) {


        Showroom showroom = new Showroom(10,5);


        if(Showroom.correctSpaces(showroom)){
            System.out.println("Los espacios introducidos son correctos");

            for(int i = 0; Showroom.getShowVehicles() > i; i++){
                CreateVehicle.createRandomVehicle();
            }

            for(int i = 0; CreateVehicle.cars.size() > i; i++){
                System.out.println(CreateVehicle.cars.get(i));
            }
            for(int i = 0; CreateVehicle.boats.size() > i; i++){
                System.out.println(CreateVehicle.boats.get(i));
            }
            for(int i = 0; CreateVehicle.motorcycles.size() > i; i++){
                System.out.println(CreateVehicle.motorcycles.get(i));
            }

        }else{
            System.out.println("Los espacios introducidos son incorrectos.");
        }




    }
}
