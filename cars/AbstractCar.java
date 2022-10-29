package cars;

import bridges.AllSeasonTires;
import bridges.ElectricEngine;
import bridges.Engine;
import bridges.Tires;
import bridges.WinterTires;
import factories.Ceiling;
import factories.GloveCompartment;
import factories.Upholstery;

public abstract class AbstractCar implements Car {
    protected String model;
    protected Engine engine;
    protected Tires tires;
    protected Upholstery upholstery;
    protected Ceiling ceiling;
    protected GloveCompartment gloveCompartment;

    protected AbstractCar(Engine engine, Tires tires, Upholstery upholstery, Ceiling ceiling,
            GloveCompartment gloveCompartment) {
        this.engine = engine;
        this.tires = tires;
        this.upholstery = upholstery;
        this.ceiling = ceiling;
        this.gloveCompartment = gloveCompartment;
    }

    @Override
    public void startCar() {
        this.engine.start();
        this.tires.start();
    }

    @Override
    public void stopCar() {
        this.engine.stop();
        this.tires.stop();
    }

    @Override
    public String toString() {
        String engineType = this.engine instanceof ElectricEngine ? "Electric" : "Gas";
        String TireType = this.tires instanceof AllSeasonTires
                ? this.tires instanceof WinterTires ? "Winter" : "All Season"
                : "Summer";
        return "Car [ceiling=" + this.ceiling.getName() + ", engine=" + engineType + " gloveCompartment="
                + this.gloveCompartment.getName() + ", tires="
                + TireType + ", upholstery=" + this.upholstery.getName() + "]";
    }

    // to be extended by decorators
    @Override
    public void park() {
        System.out.println("Parking car");
    }

    @Override
    public void entertain() {
        System.out.println("Entertaining with radio");
    }

    @Override
    public int getPrice() {
        return this.engine.getPrice() + this.tires.getPrice() + this.upholstery.getPrice() + this.ceiling.getPrice()
                + this.gloveCompartment.getPrice();
    }

    @Override
    public void printCarInterior() {
        System.out.println("Ceiling " + this.ceiling.getName() + " " + this.ceiling.getColor() + "\n" +
                "Upholstery " + this.upholstery.getName() + " " + this.upholstery.getColor() + "\n" +
                "Glove Compartment " + this.gloveCompartment.getName() + " capacity: "
                + this.gloveCompartment.getCapacity() + "\n");
    }

}
