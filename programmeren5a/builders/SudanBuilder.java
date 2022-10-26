package builders;

import cars.Sudan;

public class SudanBuilder extends AbstractCarBuilder implements CarBuilder {

    @Override
    public Sudan build() {
        return new Sudan(this.engine, this.tires, this.interiorFactory.createUpholstery(),
                this.interiorFactory.createCeiling(), this.interiorFactory.createGloveCompartment(), this.numberOfDoors);
    }
}