package cars;

import bridges.Engine;
import bridges.Tires;
import interior.Ceiling;
import interior.GloveCompartment;
import interior.Upholstery;

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
}