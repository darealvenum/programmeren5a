package builders;


import cars.Car;

public interface CarBuilder {
    CarBuilder setEngine(String engine);

    CarBuilder setTires(String tires);

    CarBuilder setInterior(String interiorType);

    CarBuilder addDecorator(DecoratorType decoratorType);

    CarBuilder assemble();

    Car build();

}