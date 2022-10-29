package builders;

import cars.*;


public class SedanCarBuilder extends AbstractCarBuilder {
    private int numSeats;

    @Override
    public SedanCarBuilder assemble() {
        this.car = new Sedan(this.engine, this.tires,
                this.interiorFactory.createUpholstery(),
                this.interiorFactory.createCeiling(),
                this.interiorFactory.createGloveCompartment(), this.numSeats);
        return this;
    }

    public SedanCarBuilder setNumSeats(int numSeats) {
        this.numSeats = numSeats;
        return this;
    }

    @Override
    public Car build() {
        return car;
    }
}