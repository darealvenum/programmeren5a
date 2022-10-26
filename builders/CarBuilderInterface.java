package builders;

import interior.*;
import cars.*;
import bridges.*;


public interface CarBuilderInterface {
    public void setEngine(Engine engine);
    public void setTires(Tires tires);
    public void setInterior(String interiorType);
    public void addDecorator(Class<?> decorator);
    public void build();
    public CarInterface getCar();
}