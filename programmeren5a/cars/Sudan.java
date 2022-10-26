package cars;

import bridges.Engine;
import bridges.Tires;
import interior.Ceiling;
import interior.GloveCompartment;
import interior.Upholstery;

public class Sudan extends AbstractCar {
    private int numDoors = 4;

    public Sudan(Engine engine, Tires tires, Upholstery upholstery, Ceiling ceiling, GloveCompartment gloveCompartment,
            int numDoors) {
        super(engine, tires, upholstery, ceiling, gloveCompartment);
        this.numDoors = numDoors;
    }

    @Override
    public String toString() {
        return super.toString() + " & Sudan with " + numDoors + " doors";
    }
}
