package decorators;

import cars.Car;

public class SoundSystemDecorator extends CarDecorator {
    public SoundSystemDecorator(Car car) {
        super(car);
    }

    public void entertain() {
        this.car.entertain();
        System.out.println("and sound system");
    }
}   