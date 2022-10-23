package cars;

import interior.*;
import bridges.*;

public abstract class Car {
    protected String model; 
    protected Engine engine;
    protected Tires tires;
    protected Upholstery upholstery;
    protected Ceiling ceiling;
    protected GloveCompartment gloveCompartment;

    // getters
    public Engine getEngine() {
        return engine;
    }

    public Tires getTires() {
        return tires;
    }

    public Upholstery getUpholstery() {
        return upholstery;
    }

    public Ceiling getCeiling() {
        return ceiling;
    }

    public GloveCompartment getGloveCompartment() {
        return gloveCompartment;
    }



    protected Car(Engine engine, Tires tires, Upholstery upholstery, Ceiling ceiling, GloveCompartment gloveCompartment) {
        this.engine = engine;
        this.tires = tires;
        this.upholstery = upholstery;
        this.ceiling = ceiling;
        this.gloveCompartment = gloveCompartment;
    }
    public void startCar() {
        this.engine.start();
        this.tires.start();
    }

    public void stopCar() {
        this.engine.stop();
        this.tires.stop();
    }

    @Override
    public String toString() {
        String engineType = this.engine instanceof ElectricEngine ? "Electric" : "Gas";
        String TireType = this.tires instanceof AllSeasonTires ? this.tires instanceof WinterTires ? "Winter" : "All Season" : "Summer";
        return "Car [ceiling=" + this.ceiling.getName() + ", engine=" + engineType + " gloveCompartment=" + this.gloveCompartment.getName() + ", tires="
                + TireType + ", upholstery=" + this.upholstery + "]";
    }
  
    // to be extended by decorators
    public void park() {
        System.out.println("Parking car");
    }



}








