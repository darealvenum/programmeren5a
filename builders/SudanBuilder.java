package builders;

import interior.*;
import cars.*;
import bridges.*;

public class SudanBuilder implements CarBuilderInterface {
    private InteriorFactory interiorFactory;
    private Engine engine;
    private Tires tires;
    private int numDoors;

    // final object
    private CarInterface car;

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTires(Tires tires) {
        this.tires = tires;
    }

    @Override
    public void setInterior(String interiorType) {
        if (interiorType.toLowerCase().equals("classic")) {
            this.interiorFactory = new ClassicInteriorFactory();
        } else if (interiorType.toLowerCase().equals("modern")) {
            this.interiorFactory = new ModernInteriorFactory();
        } else {
            System.out.println("Invalid interior type");
        }
    }

    
    @Override
    public void addDecorator(Class<?> decorator) {
        try {
            this.car = (CarInterface) decorator.getDeclaredConstructors()[0].newInstance(this.car);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    

    @Override
    public void build() {
        this.car = new Sudan(this.engine, this.tires, this.interiorFactory.createUpholstery(),
                this.interiorFactory.createCeiling(), this.interiorFactory.createGloveCompartment(), this.numDoors);
    }

    @Override
    public CarInterface getCar() {
        return this.car;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }
}