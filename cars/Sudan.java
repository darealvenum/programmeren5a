package cars;

import interior.*;
import bridges.*;

public class Sudan extends Car {
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
