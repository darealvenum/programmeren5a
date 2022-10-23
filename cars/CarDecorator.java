package cars;

public class CarDecorator extends Car {
    protected Car car;

    public CarDecorator(Car car) {
        super(car.getEngine(), car.getTires(), car.getUpholstery(), car.getCeiling(), car.getGloveCompartment());
        this.car = car;
    }

    @Override
    public void startCar() {
        car.startCar();
    }

    @Override
    public void stopCar() {
        car.stopCar();
    }

    @Override
    public String toString() {
        return car.toString();
    }
}