package main;

import java.util.List;
import java.util.Optional;

import builders.DecoratorType;
import cars.Car;
import sellers.*;

public class Main {
    public static void main(String[] args) {

        Car car = new Seller().orderCar("sedan",
                "modern",
                "diesel",
                "allseason",
                List.of(DecoratorType.SOUNDS_SYSTEM, DecoratorType.PARK_ASSIST)
                );

        PaymentService paymentStrategy = new PaymentService(new PaypalService());
        paymentStrategy.pay(car.getPrice());
    
        System.out.println(car);
        car.startCar();
        car.stopCar();
        car.park();
        car.entertain();

        car.printCarInterior();

        System.out.println("Price: " + car.getPrice());

    }
}
