package decorators;

import cars.Car;

public class ParkAssistDecorator extends CarDecorator {
    public ParkAssistDecorator(Car car) {
        super(car);
    }

    public void park() {
        this.car.park();
        System.out.println("with auto parking");
    }
}