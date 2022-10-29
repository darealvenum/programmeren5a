package decorators;

import cars.Car;

public abstract class CarDecorator implements Car {
    protected Car car;

    public CarDecorator(Car car) {
        this.car = car;
    }

    @Override
    public void park() {
        this.car.park();
    }

    @Override
    public void entertain() {
        this.car.entertain();
    }

    @Override
    public void startCar() {
        this.car.startCar();
    }

    @Override
    public void stopCar() {
        this.car.stopCar();
    }

    @Override
    public String toString() {
        return this.car.toString();
    }

    @Override
    public void printCarInterior() {
        this.car.printCarInterior();
    }

}