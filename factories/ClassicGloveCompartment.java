package factories;

public class ClassicGloveCompartment implements GloveCompartment {

    public String getName() {
        return "Classic Glove Compartment";
    }

    public int getCapacity() {
        return 3;
    }

    public int getPrice() {
        return 100;
    }
}