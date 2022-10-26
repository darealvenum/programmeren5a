package builders;

import bridges.Engine;
import bridges.Tires;
import cars.Car;
import decorator.ParkAssistDecorator;
import decorator.SoundSystemDecorator;
import interior.ClassicInteriorFactory;
import interior.InteriorFactory;
import interior.ModernInteriorFactory;

public abstract class AbstractCarBuilder implements CarBuilder {

    protected Car car;
    protected Tires tires;
    protected Engine engine;
    protected int numberOfDoors;
    protected InteriorFactory interiorFactory;

    @Override
    public CarBuilder setEngine(Engine engine) {
        this.engine = engine;
        return this;
    }

    @Override
    public CarBuilder setTires(Tires tires) {
        this.tires = tires;
        return this;
    }

    @Override
    public CarBuilder setInterior(String interiorType) {
        if (interiorType.equalsIgnoreCase("classic")) {
            this.interiorFactory = new ClassicInteriorFactory();
        } else if (interiorType.equalsIgnoreCase("modern")) {
            this.interiorFactory = new ModernInteriorFactory();
        } else {
            System.out.println("Invalid interior type");
        }
        return this;
    }

    @Override
    public CarBuilder addDecorator(DecoratorType decoratorType) {
        switch (decoratorType) {
        case PARK_ASSIST -> this.car = new ParkAssistDecorator(this.car);
        case SOUNDS_SYSTEM -> this.car = new SoundSystemDecorator(this.car);
        }
        return this;
    }

    public CarBuilder setNumDoors(int numDoors) {
        this.numberOfDoors = numDoors;
        return this;
    }

}
