package main;

import bridges.AllSeasonTires;
import bridges.DieselEngine;
import builders.DecoratorType;
import builders.SportsCarBuilder;
import cars.Car;

public class Main {
    public static void main(String[] args) {

        // CarInterface car = new Seller().orderCar(
        //     "modern",
        //     "diesel",
        //     "allseason"
        // );
        // // System.out.println(car);
        // // carWithParkAssist.startCar();
        // // carWithParkAssist.stopCar();
        // System.out.println(car);
        // car.entertain();
        // car.park();
        // car.startCar();
        // car.stopCar();

        Car car = new SportsCarBuilder()
                .setEngine(new DieselEngine())
                .setTires(new AllSeasonTires())
                .setInterior("modern")
                .setTurbo(true)
                .addDecorator(DecoratorType.PARK_ASSIST)
                .build();

        System.out.println(car);
        car.park();
    }
}
