package builders;

import bridges.Engine;
import bridges.Tires;
import cars.Car;

public interface CarBuilder {
    CarBuilder setEngine(Engine engine);

    CarBuilder setTires(Tires tires);

    CarBuilder setInterior(String interiorType);

    CarBuilder addDecorator(DecoratorType decoratorType);

    /**
     * Allow the sub-class to determine whether this method actually does anything.
     * @param turbo
     * @return
     */
    default CarBuilder setTurbo(boolean turbo) {
        return this;
    }

    Car build();

}