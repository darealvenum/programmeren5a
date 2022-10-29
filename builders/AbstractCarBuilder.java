package builders;

import cars.*;
import decorators.*;
import bridges.*;
import factories.*;

public abstract class AbstractCarBuilder implements CarBuilder {
    protected InteriorFactory interiorFactory;
    protected Engine engine;
    protected Tires tires;
    protected Car car;

   

    @Override
    public AbstractCarBuilder setEngine(String engine) {
        if(engine.equals("electric")) {
            this.engine = new ElectricEngine();
        } else if(engine.equals("diesel")) {
            this.engine = new DieselEngine();
        } else {
            throw new IllegalArgumentException("Unknown engine type");
        }

        return this;
    }

    public AbstractCarBuilder setEngineCapacity(int engineCapacity) {
        if(this.engine instanceof DieselEngine) {
            ((DieselEngine) this.engine).setMaxCapacity(engineCapacity);
        } else {
            throw new IllegalArgumentException("Engine capacity can only be set for diesel engine");
        }

        return this;
    }


    @Override
    public AbstractCarBuilder setTires(String tires) {
        if(tires.equals("winter")) {
            this.tires = new WinterTires();
        } else if(tires.equals("summer")) {
            this.tires = new SummerTires();
        } else if(tires.equals("allseason")) {
            this.tires = new AllSeasonTires();
        } else {
            throw new IllegalArgumentException("Unknown tires type");
        }

        return this;
    }
    @Override
    public AbstractCarBuilder setInterior(String interiorType) {
        switch (interiorType) {
            case "modern":
                this.interiorFactory = new ModernInteriorFactory();
                break;
            case "classic":
                this.interiorFactory = new ClassicInteriorFactory();
                break;
            default:
                throw new IllegalArgumentException("Unknown interior type");
        }

        return this;
    }

    @Override
    public AbstractCarBuilder addDecorator(DecoratorType decoratorType) {
        switch (decoratorType) {
            case PARK_ASSIST:
                this.car = new ParkAssistDecorator(car);
                break;
            case SOUNDS_SYSTEM:
                this.car = new SoundSystemDecorator(car);
                break;
            default:
                break;
        }
        return this;
    }

    @Override
    abstract public AbstractCarBuilder assemble();
    public Car build() {
        return car;
    }
}