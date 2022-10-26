package cars;

public class CarWithParkAssist extends CarDecorator {
    public CarWithParkAssist(CarInterface car) {
        super(car);
    }

    public void park() {
        this.car.park();
        System.out.println("with auto parking");
    }
}