package cars;

import bridges.Engine;
import bridges.Tires;
import factories.Ceiling;
import factories.GloveCompartment;
import factories.Upholstery;

// sportcars should have an extra attribute
public class SportsCar extends AbstractCar {
    private final boolean turbo;

    public SportsCar(Engine engine, Tires tires, Ceiling ceiling, Upholstery upholstery, GloveCompartment gloveCompartment, boolean turbo) {
        super(engine, tires, upholstery, ceiling, gloveCompartment);
        this.turbo = turbo;
    }

    public boolean isTurbo() {
        return turbo;
    }

    @Override
    public String toString() {
        return String.format("%s & sports car %s", super.toString(), turbo ? "with turbo" : "");
    }

    @Override
    public void startCar() {
        if(this.turbo) {
            System.out.println("Starting turbo..");
        }
        super.startCar();
    }

    @Override
    public void stopCar() {
        if(this.turbo) {
            System.out.println("Stopping turbo..");
        }
        super.stopCar();
    }
}