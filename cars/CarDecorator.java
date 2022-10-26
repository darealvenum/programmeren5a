package cars;

public class CarDecorator implements CarInterface {
    protected CarInterface car;
    public CarDecorator(CarInterface car) {
        this.car = car;
    }
    public void park() {
        this.car.park();
    }

    public void entertain() {
        this.car.entertain();
    }

    public void startCar() {
        this.car.startCar();
    }

    public void stopCar() {
        this.car.stopCar();
    }

    @Override
    public String toString() {
        return this.car.toString();
    }
}