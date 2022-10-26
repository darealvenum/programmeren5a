import java.util.Scanner;
import interior.*;
import cars.*;
import bridges.*;
import sellers.*;
import builders.*;

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

        SportsCarBuilder b = new SportsCarBuilder();
        b.setEngine(new DieselEngine());
        b.setTires(new AllSeasonTires());
        b.setInterior("modern");
        b.setTurbo(true);
        b.build();
        b.addDecorator(CarWithParkAssist.class);
        CarInterface car = b.getCar();
        System.out.println(car);
        car.park();
    }
}
