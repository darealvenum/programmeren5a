package builders;

import cars.*;


public class SportsCarBuilder extends AbstractCarBuilder {
    private boolean turbo;
    @Override
    public SportsCarBuilder assemble() {
        this.car = new SportsCar(this.engine, this.tires,
                this.interiorFactory.createCeiling(),
                this.interiorFactory.createUpholstery(),
                this.interiorFactory.createGloveCompartment(), this.turbo);
        return this;
    }

    public SportsCarBuilder setTurbo(boolean turbo) {
        this.turbo = turbo;
        return this;
    }   


    @Override
    public Car build() {
        return car;
    }

}