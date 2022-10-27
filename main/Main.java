package main;

import java.util.List;

import builders.DecoratorType;
import cars.Car;
import sellers.Seller;

public class Main {
    public static void main(String[] args) {

        Car car = new Seller().orderCar("sedan",
                "modern",
                "electric",
                "winter",
                List.of(DecoratorType.SOUNDS_SYSTEM));

        System.out.println(car);
        car.startCar();
        car.stopCar();
        car.park();
        car.entertain();
    }
}
