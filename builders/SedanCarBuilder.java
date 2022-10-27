package builders;

import cars.*;


public class SedanCarBuilder extends AbstractCarBuilder {
    private int numDoors;

    @Override
    public SedanCarBuilder assemble() {
        this.car = new Sudan(this.engine, this.tires,
                this.interiorFactory.createUpholstery(),
                this.interiorFactory.createCeiling(),
                this.interiorFactory.createGloveCompartment(), this.numDoors);
        return this;
    }

    public SedanCarBuilder setNumDoors(int numDoors) {
        this.numDoors = numDoors;
        return this;
    }

    @Override
    public Car build() {
        return car;
    }
}