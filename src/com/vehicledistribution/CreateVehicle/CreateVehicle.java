package com.vehicledistribution.CreateVehicle;

import com.vehicledistribution.Boats.Boats;
import com.vehicledistribution.Car.Car;
import com.vehicledistribution.Motocicle.Motocicle;

import java.util.ArrayList;
import java.util.Random;

public class CreateVehicle {

    public static ArrayList<Boats> boats = new ArrayList<Boats>();
    public static ArrayList<Car> cars = new ArrayList<Car>();
    public static ArrayList<Motocicle> motorcycles = new ArrayList<Motocicle>();

    public static String[] brands = {"Mazda", "Mercedes", "Lamborghini", "Renault", "Hyundai", "BMW", "Ford"};
    public static String[] models = {"100L", "E50", "A200", "Rancher", "Brandit"};
    public static String[] colors = {"White", "Blue", "Red", "Yellow", "Green", "Black"};


    public static void createRandomVehicle(){

        int randomVehicle = (int) (Math.random() * 3);
        int randomWheels = (int) (Math.random() * 4);
        int randomLiters = (int) (Math.random() * 70);
        int randomDoors = (int) (Math.random() * 4);
        int randomSeats = (int) (Math.random() * 5);
        int randomCilinder = (int) (Math.random() * 7000);
        int randomHorsePowered = (int) (Math.random() * 600);


        String selectBrand = brands[(int) (Math.random() * brands.length)];
        String selectModel = models[(int) (Math.random() * models.length)];
        String selectColor = colors[(int) (Math.random() * colors.length)];
        Random rd = new Random();

        switch (randomVehicle){
            case 1:
                int randomLength = (int) (Math.random() * 100);

                Boats boat = new Boats(selectBrand, selectModel, 0, randomCilinder, randomHorsePowered,
                        selectColor, randomLength, rd.nextBoolean() );
                boats.add(boat);

                break;
            case 2:
                Car car = new Car(selectBrand, selectModel, randomWheels,randomCilinder, randomHorsePowered,
                        selectColor,randomDoors,randomLiters,randomSeats);
                cars.add(car);
                break;
            case 3:
                Motocicle motocycle = new Motocicle(selectBrand, selectModel, randomWheels, randomCilinder,
                        randomHorsePowered,selectColor, rd.nextBoolean());
                motorcycles.add(motocycle);
                break;
        }

    }


}
