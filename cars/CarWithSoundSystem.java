package cars;

public class CarWithSoundSystem extends CarDecorator {
    public CarWithSoundSystem(CarInterface car) {
        super(car);
    }

    public void entertain() {
        this.car.entertain();
        System.out.println("and sound system");
    }
}   