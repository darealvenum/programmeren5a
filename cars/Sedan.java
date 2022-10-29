package cars;

import bridges.Engine;
import bridges.Tires;
import factories.Ceiling;
import factories.GloveCompartment;
import factories.Upholstery;

public class Sedan extends AbstractCar {
    private int numSeats = 4;

    public Sedan(Engine engine, Tires tires, Upholstery upholstery, Ceiling ceiling, GloveCompartment gloveCompartment,
            int numSeats) {
        super(engine, tires, upholstery, ceiling, gloveCompartment);
        this.numSeats = Math.max(1, Math.min(4, numSeats));
    }


    @Override
    public String toString() {
        return super.toString() + " & Sedan with " + this.numSeats + " seats";
    }
}
