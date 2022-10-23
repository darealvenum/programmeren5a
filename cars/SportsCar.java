package cars;
import interior.*;
import bridges.*;
// sportcars should have an extra attribute
public class SportsCar extends Car {
    private boolean turbo;
    public SportsCar(Engine engine, Tires tires, Ceiling ceiling, Upholstery upholstery, GloveCompartment gloveCompartment, boolean turbo) {
        super(engine, tires, upholstery, ceiling, gloveCompartment);
        this.turbo = turbo;
    }
    
    public boolean isTurbo() {
        return turbo;
    }


    @Override
    public String toString() {
        String superRepr = super.toString();
        if (turbo) {
            return superRepr + " & sports car with turbo";
        }
        return superRepr + " & sports car";
    }
}