package builders;

import cars.SportsCar;

public class SportsCarBuilder extends AbstractCarBuilder implements CarBuilder {

    private boolean turbo;

    @Override
    public SportsCar build() {
        return new SportsCar(this.engine, this.tires, this.interiorFactory.createCeiling(),
                this.interiorFactory.createUpholstery(),
                this.interiorFactory.createGloveCompartment(), this.turbo);
    }

    public SportsCarBuilder setTurbo(boolean turbo) {
        this.turbo = turbo;
        return this;
    }
}