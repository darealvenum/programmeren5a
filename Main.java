import java.util.Scanner;
import interior.*;
import cars.*;
import bridges.*;
import sellers.*;

public class Main {
    public static void main(String[] args) {

        CarInterface car = new Seller().orderCar(
            "modern",
            "diesel",
            "allseason"
        );
        // System.out.println(car);
        // carWithParkAssist.startCar();
        // carWithParkAssist.stopCar();
        System.out.println(car);
        car.entertain();
        car.park();
        car.startCar();
        car.stopCar();
    }
}
